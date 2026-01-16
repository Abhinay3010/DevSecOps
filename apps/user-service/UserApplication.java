package com.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class UserApplication {

    @GetMapping("/user")
    public String user() {
        return "User Service is UP";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
