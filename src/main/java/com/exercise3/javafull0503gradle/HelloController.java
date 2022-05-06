package com.exercise3.javafull0503gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Hello, Gradle Spring World!";
    }
}
