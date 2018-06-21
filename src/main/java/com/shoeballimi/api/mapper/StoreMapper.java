package com.shoeballimi.api.mapper;

import com.shoeballimi.api.model.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {
    List<Store> findAll();
    Store findById(Long id);
    void save(Store store);
    void update(Store store);
    void delete(Long id);
}
