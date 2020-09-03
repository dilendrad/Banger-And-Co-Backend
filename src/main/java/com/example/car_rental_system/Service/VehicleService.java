package com.example.car_rental_system.Service;

import com.example.car_rental_system.Entity.Vehicle;
import com.example.car_rental_system.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public Vehicle saveVehicle(Vehicle vehicle)
    {
        return repository.save(vehicle);
    }

    public List<Vehicle> saveVehicles(List<Vehicle> vehicles)
    {
        return repository.saveAll(vehicles);
    }

    public List<Vehicle> getVehicles()
    {
        return repository.findAll();
    }

//    public Vehicle getVehicleByID (int id)
//    {
//        return repository.findById(id).orElse(null);
//    }

    public String deleteVehicle(int id)
    {
        repository.deleteById(id);
        return  +id+ " has been removed successfully!";
    }

    public Vehicle updateVehicle (Vehicle vehicle)
    {
        Vehicle existingVehicle = repository.findById(vehicle.getVehicleID()).orElse(null);
        existingVehicle.setVehicleName(vehicle.getVehicleName());
        existingVehicle.setCategory(vehicle.getCategory());
        existingVehicle.setTransmissionType(vehicle.getTransmissionType());
        existingVehicle.setFuelType(vehicle.getFuelType());
        return repository.save(existingVehicle);
    }

}
