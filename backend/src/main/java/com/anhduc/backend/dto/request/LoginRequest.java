package com.anhduc.backend.dto.request;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String email;
    private String password;
}
