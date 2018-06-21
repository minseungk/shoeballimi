package com.shoeballimi.api.service;

import com.shoeballimi.api.mapper.BrandMapper;
import com.shoeballimi.api.model.Brand;
import com.shoeballimi.api.model.request.brand.SaveBrandRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    BrandMapper brandMapper;

    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

    public Brand findById(Long id) {
        return brandMapper.findById(id);
    }

    public void save(SaveBrandRequest brandRequest) {
        brandMapper.save(new Brand(brandRequest));
    }
}
