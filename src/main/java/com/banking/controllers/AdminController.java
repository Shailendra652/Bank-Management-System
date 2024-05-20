package com.banking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.User;
import com.banking.services.AdminServices;

@RestController
public class AdminController {
	
	@Autowired
	AdminServices adminServices;
	
	@GetMapping("/getCustomers")
	public Object getAllCustomers() {
		return adminServices.getAllCustomers();
	}
	
	@GetMapping("/getCustomerById/{id}")
	public User getCustomerById(@PathVariable("id") int id){
		return adminServices.getCustomerById(id);
	}
}
