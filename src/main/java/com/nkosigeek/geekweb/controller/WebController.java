package com.nkosigeek.geekweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkosigeek.geekweb.model.User;
import com.nkosigeek.geekweb.service.IWebService;

@RestController
@RequestMapping("/user")
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
}
