package com.delivery.deliveryapp.repositories;

import com.delivery.deliveryapp.entities.Category;
import com.delivery.deliveryapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
