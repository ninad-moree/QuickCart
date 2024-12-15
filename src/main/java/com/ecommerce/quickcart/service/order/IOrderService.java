package com.ecommerce.quickcart.service.order;

import java.util.List;

import com.ecommerce.quickcart.dto.OrderDto;
import com.ecommerce.quickcart.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
