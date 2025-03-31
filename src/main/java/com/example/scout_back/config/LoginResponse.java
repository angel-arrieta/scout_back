package com.example.scout_back.config;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;

    private long expiresIn;
}
