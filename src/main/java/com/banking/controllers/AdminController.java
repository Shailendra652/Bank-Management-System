package com.banking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.services.AdminServices;

@RestController
public class AdminController {
	
	@Autowired
	AdminServices adminServices;
	
	@GetMapping("/getCustomers")
	public Object getAllCustomers() {
		return adminServices.getAllCustomers();
	}
}
