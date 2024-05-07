package com.delivery.deliveryapp.repositories;

import com.delivery.deliveryapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
