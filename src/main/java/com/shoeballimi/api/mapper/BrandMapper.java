package com.shoeballimi.api.mapper;

import com.shoeballimi.api.model.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {
    List<Brand> findAll();
    Brand findById(Long id);
    void save(Brand brand);
    void update(Brand brand);
    void delete(Long id);
}
