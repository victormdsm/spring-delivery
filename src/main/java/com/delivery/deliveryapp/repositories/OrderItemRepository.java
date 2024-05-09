package com.delivery.deliveryapp.repositories;

import com.delivery.deliveryapp.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
