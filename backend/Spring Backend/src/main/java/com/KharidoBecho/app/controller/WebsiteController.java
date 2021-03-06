package com.KharidoBecho.app.controller;

import com.KharidoBecho.app.entity.Users;
import com.KharidoBecho.app.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebsiteController {

    @Autowired
    private WebsiteService service;

    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/Users")
    public List<Users> findAllUsers() {
        return service.getUsers();
    }
}
