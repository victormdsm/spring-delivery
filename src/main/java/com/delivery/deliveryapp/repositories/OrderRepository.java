package com.delivery.deliveryapp.repositories;

import com.delivery.deliveryapp.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
