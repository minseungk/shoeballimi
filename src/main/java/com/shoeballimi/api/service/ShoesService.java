package com.shoeballimi.api.service;

import com.shoeballimi.api.mapper.ShoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class ShoesService {

    @Autowired
    ShoesMapper shoesMapper;

}
