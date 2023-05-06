package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileWebController {

    @GetMapping("/")
    public String hello(){
        return "Welcome to my site";
    }
}