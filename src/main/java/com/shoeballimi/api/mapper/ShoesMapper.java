package com.shoeballimi.api.mapper;

import com.shoeballimi.api.model.Shoes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoesMapper {
    List<Shoes> findAll();
    Shoes findById(Long id);
    void save(Shoes store);
    void update(Shoes store);
    void delete(Long id);
}
