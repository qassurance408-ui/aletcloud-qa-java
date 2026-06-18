package com.aletcloud.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "<h1>☕ AletCloud QA - Spring Boot Test</h1><p>Java Runtime & Maven Build: <strong>SUCCESSFUL</strong></p>";
    }
}