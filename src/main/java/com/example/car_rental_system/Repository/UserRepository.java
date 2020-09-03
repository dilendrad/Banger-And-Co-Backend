package com.example.car_rental_system.Repository;

import com.example.car_rental_system.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {



}
