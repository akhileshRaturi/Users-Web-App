package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface MyService {
    List<User> getUsers();
    User addUser(User user);
    public boolean deleteUser(User user);
}
