package com.example.car_rental_system.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="vehicle")
public class Vehicle {

    @Id
    @GeneratedValue
    private int vehicleID;
    private String vehicleName;
    private String category;
    private String transmissionType;
    private String fuelType;

}
