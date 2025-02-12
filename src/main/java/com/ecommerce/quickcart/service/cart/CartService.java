package com.ecommerce.quickcart.service.cart;

import java.math.BigDecimal;
import java.util.Optional;
// import java.util.concurrent.atomic.AtomicLong;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.quickcart.dto.CartDto;
import com.ecommerce.quickcart.exceptions.ResourceNotFoundException;
import com.ecommerce.quickcart.model.Cart;
import com.ecommerce.quickcart.model.User;
import com.ecommerce.quickcart.repository.CartItemRepository;
import com.ecommerce.quickcart.repository.CartRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService  {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ModelMapper modelMapper;
    // private final AtomicLong cartIdGenerator = new AtomicLong(0);

    @Override
    public Cart getCart(Long id) {
        Cart cart = cartRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cart not found"));

        BigDecimal totalAmount = cart.getTotalAmount();
        cart.setTotalAmount(totalAmount);

        return cartRepository.save(cart);
    }

    @Transactional
    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getCartItems().clear();
        cartRepository.deleteById(id);
    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalAmount();
    }

    @Override
    public Cart inititalizeNewCart(User user) {
        return Optional.ofNullable(getCartByUserId(user.getId())).orElseGet(() -> {
            Cart cart = new Cart();
            cart.setUser(user);
            return cartRepository.save(cart);
        });
    }

    @Override
    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    public CartDto convertToDto(Cart cart) {
        return modelMapper.map(cart, CartDto.class);
    }

}
