package com.example.car_rental_system.Service;

import com.example.car_rental_system.Entity.User;
import com.example.car_rental_system.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users)
    {
        return userRepository.saveAll(users);
    }

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

//    public User getUserByID (int id)
//    {
//        return userRepository.findById(id).orElse(null);
//    }

    public String deleteUser(int id)
    {
        userRepository.deleteById(id);
        return  +id+ " has been removed successfully!";
    }

    public User updateUser (User user)
    {
        User existingUser = userRepository.findById(user.getUserID()).orElse(null);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setUsername(user.getUsername());
        existingUser.setUserNIC(user.getUserNIC());
        existingUser.setDateOfBirth(user.getDateOfBirth());
        existingUser.setAddress(user.getAddress());
        return userRepository.save(existingUser);
    }
}
