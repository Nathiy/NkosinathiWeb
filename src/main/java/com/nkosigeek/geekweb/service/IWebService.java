package com.nkosigeek.geekweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nkosigeek.geekweb.model.User;

@Service
public interface IWebService 
{
    public User saveUser(User user);
    public List<User> getAllUsers();
}
