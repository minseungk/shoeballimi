package com.shoeballimi.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoesController {

    @GetMapping("/health")
    public ResponseEntity getHelth() {
        return ResponseEntity.ok("ok");
    }

}
