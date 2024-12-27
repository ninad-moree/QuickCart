package com.ecommerce.quickcart.service.cart;

import java.math.BigDecimal;

import com.ecommerce.quickcart.dto.CartDto;
import com.ecommerce.quickcart.model.Cart;
import com.ecommerce.quickcart.model.User;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Cart inititalizeNewCart(User user);

    Cart getCartByUserId(Long userId);

    CartDto convertToDto(Cart cart);
}
