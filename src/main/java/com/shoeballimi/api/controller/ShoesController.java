package com.shoeballimi.api.controller;

import com.shoeballimi.api.mapper.ShoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoesController {

    @Autowired
    ShoesMapper shoesMapper;

    @GetMapping("/health")
    public ResponseEntity getHelth() {
        shoesMapper.health();
        return ResponseEntity.ok("ok");
    }

}
