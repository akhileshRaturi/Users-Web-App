package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
public class MyServiceImpl implements MyService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User addUser(User task) {
        return userRepository.save(task);
    }

    @Override
    public boolean deleteUser(User task) {
        boolean status=false;
        try{
            userRepository.delete(task);
            status=true;
            System.out.println(status);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }


}
