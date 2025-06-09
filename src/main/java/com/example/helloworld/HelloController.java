package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            response.append("Hello World<br>");
        }
        return response.toString();
    }
}
