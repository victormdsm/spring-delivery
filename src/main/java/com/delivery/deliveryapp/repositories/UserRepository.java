package com.delivery.deliveryapp.repositories;

import com.delivery.deliveryapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
