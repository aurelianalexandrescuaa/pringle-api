package com.aaproj.pringleapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<Object> getUsers() {
        LOGGER.info("/user called Yo");
        return ResponseEntity.ok(Arrays.asList("dude1", "dude2", "duda3"));
    }
}
