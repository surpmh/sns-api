package com.likelion.likelionproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("최아영");
    }
}
