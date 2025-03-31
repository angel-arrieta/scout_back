package com.example.scout_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.scout_back")
public class ScoutBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoutBackApplication.class, args);
    }

}
