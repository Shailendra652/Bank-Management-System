package com.banking.controllers;

import com.banking.Storage.DataStorage;
import com.banking.entity.User;
import com.banking.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServices userService = new UserServices();

    @GetMapping("/allCustomers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @PostMapping("/addUser")
    public void addUser(User user) {

        userService.addUser(user);

    }


}
