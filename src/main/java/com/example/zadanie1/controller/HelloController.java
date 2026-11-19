package com.example.zadanie1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/", "/hello"})
public class HelloController {

    // Wyświetla "Hello World" w przeglądarce pod adresem http://localhost:8080 oraz http://localhost:8080/hello
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
