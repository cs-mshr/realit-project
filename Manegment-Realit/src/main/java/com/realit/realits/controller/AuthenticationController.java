package com.realit.realits.controller;

import com.realit.realits.controller.request.AuthenticationRequest;
import com.realit.realits.controller.request.RegisterRequest;
import com.realit.realits.controller.response.AuthenticationResponse;
import com.realit.realits.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;

    @PostMapping("/employees/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/employees/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }
}