package com.dailypractise.spring.security.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class DemoController {

    @GetMapping("/oauth")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello and welcome to Oauth2 Demo !!");
    }
}
