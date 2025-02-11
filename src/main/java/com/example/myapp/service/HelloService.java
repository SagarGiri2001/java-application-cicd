package com.example.myapp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getGreeting() {
        return "Hello, World! Welcome to the Java web application! /n This application is developed by Sagar Giri.";
    }
}
