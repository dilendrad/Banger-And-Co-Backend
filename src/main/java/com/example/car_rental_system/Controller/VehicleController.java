package com.example.car_rental_system.Controller;

import com.example.car_rental_system.Entity.Vehicle;
import com.example.car_rental_system.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class VehicleController {

    @Autowired
    private VehicleService service;

    @PostMapping("/addVehicle")
    public Vehicle addVehicle (@RequestBody Vehicle vehicle)
    {
        return service.saveVehicle(vehicle);
    }

    @PostMapping("/addVehicles")
    public List<Vehicle> addVehicles(@RequestBody List <Vehicle> vehicles)
    {
        return service.saveVehicles(vehicles);
    }

    @GetMapping("/vehicles")
    public List <Vehicle> findAllVehicles()
    {
        return service.getVehicles();
    }

    @PutMapping("/update")
    public Vehicle updateVehicle (@RequestBody Vehicle vehicle)
    {
        return service.updateVehicle(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable int id)
    {
        return service.deleteVehicle(id);
    }

}
