package com.nkosigeek.geekweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkosigeek.geekweb.model.User;
import com.nkosigeek.geekweb.service.IWebService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class WebController 
{
    @Autowired
    private IWebService webService;

    @PostMapping("/add")
    public String add(@RequestBody User user)
    {
        webService.saveUser(user);
        return "New user added";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers()
    {
        return webService.getAllUsers();
    }
}
