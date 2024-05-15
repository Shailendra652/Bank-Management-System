package com.banking.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.banking.entity.User;

@Service
public class AdminServices {

	private static List<User> listUsers = new ArrayList<User>();
	
	static {
		listUsers.add(new User(1, "Kunal Rawal", "Kunal@123", "8827182619", "kunal@gmail.com")); // id, name, password,phone,email
		listUsers.add(new User(2, "Lorem Ipsum", "Lorem@123", "6264629811", "kunal@gmail.com"));
		listUsers.add(new User(3, "Kunal Rawal", "Kunal@123", "8827182619", "kunal@gmail.com"));
		listUsers.add(new User(4, "Kunal Rawal", "Kunal@123", "8827182619", "kunal@gmail.com"));
		listUsers.add(new User(5, "Kunal Rawal", "Kunal@123", "8827182619", "kunal@gmail.com"));
	}
	
	public List<User> getAllCustomers() {
		System.out.println(listUsers);
		return listUsers;
	}
}
