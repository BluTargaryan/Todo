package com.todo.usersystem.service;

import com.todo.usersystem.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();

    public void deleteUser(Long id);
    public User updateUser(Long id, User user);
}
