package com.aaproj.pringleapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<Object> getUsers() {
        return ResponseEntity.ok(Arrays.asList("dude1", "dude2"));
    }
}
