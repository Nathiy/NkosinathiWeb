package com.nkosigeek.geekweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkosigeek.geekweb.model.User;
import com.nkosigeek.geekweb.repository.IUserRepo;

@Service
public class WebService implements IWebService 
{
    @Autowired
    private IUserRepo userRepo;

    @Override
    public User saveUser(User user)
     {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() 
    {
        return userRepo.findAll();
    }
}
