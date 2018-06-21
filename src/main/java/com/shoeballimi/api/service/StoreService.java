package com.shoeballimi.api.service;

import com.shoeballimi.api.mapper.StoreMapper;
import com.shoeballimi.api.model.Store;
import com.shoeballimi.api.model.request.store.SaveStoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreMapper storeMapper;

    public List<Store> findAll() {
        return storeMapper.findAll();
    }

    public Store findById(Long id) {
        return storeMapper.findById(id);
    }

    public void save(SaveStoreRequest storeRequest, Long brandId) {
        storeMapper.save(new Store(storeRequest, brandId));
    }


}
