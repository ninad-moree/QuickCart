package com.ecommerce.quickcart.service.user;

import com.ecommerce.quickcart.model.User;
import com.ecommerce.quickcart.request.CreateUserRequest;
import com.ecommerce.quickcart.request.UpdateUserRequest;

public interface IUserService {
    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UpdateUserRequest request, Long userId);

    void deleteUser(Long userId);
}
