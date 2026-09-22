package com.example.cicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello() {

        return Map.of(
                "message", "Hello from CI/CD!",
                "application", "ci-cd-demo",
                "version", "1.0.0"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {

        return Map.of(
                "status", "UP"
        );
    }
}