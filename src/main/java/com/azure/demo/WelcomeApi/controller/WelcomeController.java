package com.azure.demo.WelcomeApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/api/{name}")
    public String Hello(@PathVariable String name){

        return "hello: "+name+" welcome.";
    }
}
