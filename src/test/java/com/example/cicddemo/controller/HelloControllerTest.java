package com.example.cicddemo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    private final HelloController controller =
            new HelloController();

    @Test
    void helloShouldReturnExpectedMessage() {

        var response = controller.hello();

        assertEquals(
                "Hello from CI/CD!",
                response.get("message")
        );
    }

    @Test
    void healthShouldReturnUp() {

        var response = controller.health();

        assertEquals(
                "UP",
                response.get("status")
        );
    }
}