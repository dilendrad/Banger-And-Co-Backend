package com.example.car_rental_system.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue
    private int userID;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String userNIC;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dateOfBirth;
    private String address;

}
