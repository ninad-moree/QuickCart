package com.ecommerce.quickcart.service.cart;

import java.math.BigDecimal;

import com.ecommerce.quickcart.model.Cart;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Long inititalizeNewCart();
}
