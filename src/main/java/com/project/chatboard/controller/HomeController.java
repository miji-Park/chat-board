package com.project.chatboard.controller;

import org.springframework.http.ResponseEntity;

public class HomeController {
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("home");
    }
}
