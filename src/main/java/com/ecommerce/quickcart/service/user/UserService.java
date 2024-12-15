package com.ecommerce.quickcart.service.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.quickcart.exceptions.AlreadyExistsException;
import com.ecommerce.quickcart.exceptions.ResourceNotFoundException;
import com.ecommerce.quickcart.model.User;
import com.ecommerce.quickcart.repository.UserRepository;
import com.ecommerce.quickcart.request.CreateUserRequest;
import com.ecommerce.quickcart.request.UpdateUserRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public User createUser(CreateUserRequest request) {
        return Optional.of(request)
                    .filter(user -> !userRepository.existsByEmail(request.getEmail()))
                    .map(req -> {
                        User user = new User();
                        user.setEmail(request.getEmail());
                        user.setPassword(request.getPassword());
                        user.setFirstName(request.getFirstName());
                        user.setLastName(request.getLastName());
                        return userRepository.save(user);
                    }).orElseThrow(() -> new AlreadyExistsException("Oops! " + request.getEmail() + " already exists"));
    }

    @Override
    public User updateUser(UpdateUserRequest request, Long userId) {
        return userRepository.findById(userId).map(existingUser -> {
            existingUser.setFirstName(request.getFirstName());
            existingUser.setLastName(request.getLastName());
            return userRepository.save(existingUser);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.findById(userId).ifPresentOrElse(userRepository::delete, () -> {
            throw new ResourceNotFoundException("User not found");
        });
    }

}