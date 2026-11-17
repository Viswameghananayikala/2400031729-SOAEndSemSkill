package com.example.appservice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Microservice running successfully in Docker!";
    }
}
