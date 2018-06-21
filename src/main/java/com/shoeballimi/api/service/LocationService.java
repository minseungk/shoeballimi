package com.shoeballimi.api.service;

import com.shoeballimi.api.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    LocationMapper locationMapper;


}
