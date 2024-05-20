package com.banking.services;


import com.banking.Storage.DataStorage;
import com.banking.entity.User;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class UserServices {

    public List<User> getAllUsers(){
        return DataStorage.Users;
    }

    public  void addUser(User user){
        DataStorage.Users.add(user);
    }


    public boolean getUserBalance(){
        return true;
    }

    public boolean getAccountDetails(){
        return true;
    }

    public boolean updateAccDetails(){
        return true;
    }

    public void getTransactionHistory(){

    }

    public boolean deposit(double amount){
        return true;
    }

    public double withdraw(int amount){
        return 0;
    }

}
