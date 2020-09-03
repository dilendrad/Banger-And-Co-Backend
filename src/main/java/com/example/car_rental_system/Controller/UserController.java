package com.example.car_rental_system.Controller;

import com.example.car_rental_system.Entity.User;
import com.example.car_rental_system.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser (@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @PostMapping("/addMultipleUsers")
    public List<User> addUsers(@RequestBody List <User> users)
    {
        return userService.saveUsers(users);
    }

    @GetMapping("/findAllUsers")
    public List <User> findAllUsers()
    {
        return userService.getUsers();
    }

    @PutMapping("/updateUser")
    public User updateUser (@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id)
    {
        return userService.deleteUser(id);
    }
}
