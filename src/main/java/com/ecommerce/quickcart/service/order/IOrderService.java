package com.ecommerce.quickcart.service.order;

import java.util.List;

import com.ecommerce.quickcart.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    Order getOrder(Long orderId);

    List<Order> getUserOrders(Long userId);
}
