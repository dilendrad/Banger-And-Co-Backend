package com.example.car_rental_system.Repository;

import com.example.car_rental_system.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {


}
