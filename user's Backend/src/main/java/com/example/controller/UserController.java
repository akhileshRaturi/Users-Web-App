package com.example.controller;
import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getUsers()
    {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/addUser")
    void addUser(@RequestBody User task)
    {
        userRepository.save(task);
    }

    @DeleteMapping("/deleteUser/{id}")
    void deleteUser(@PathVariable("id") Long id, User task){
        task.setId(id);
        userRepository.delete(task);}
}
