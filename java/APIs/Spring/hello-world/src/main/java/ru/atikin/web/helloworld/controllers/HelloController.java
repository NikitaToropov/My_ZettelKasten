package ru.atikin.web.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello_world")
    public String hi() {
        return "hello_world";
    }
}
