package com.shoeballimi.api.service;

import com.shoeballimi.api.mapper.ShoesMapper;
import com.shoeballimi.api.model.Shoes;
import com.shoeballimi.api.model.Store;
import com.shoeballimi.api.model.request.shoes.SaveShoesRequest;
import com.shoeballimi.api.model.request.store.SaveStoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ShoesService {

    @Autowired
    ShoesMapper shoesMapper;

    public List<Shoes> findAll() {
        return shoesMapper.findAll();
    }

    public Shoes findById(Long id) {
        return shoesMapper.findById(id);
    }

    public void save(SaveShoesRequest saveShoesRequest, Long storeId) {
        shoesMapper.save(new Shoes(saveShoesRequest, storeId));
    }

}
