package com.realit.realits.controller.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@RequiredArgsConstructor
@SuperBuilder
public class AuthenticationRequest {
    private String email;
    private String password;
}
