package com.example.springSecurity.services;

import com.example.springSecurity.dto.JwtAuthenticationResponse;
import com.example.springSecurity.dto.RefreshTokenRequest;
import com.example.springSecurity.dto.SignUpRequest;
import com.example.springSecurity.dto.SigninRequest;
import com.example.springSecurity.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
