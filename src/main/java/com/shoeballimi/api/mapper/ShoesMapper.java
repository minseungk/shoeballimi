package com.shoeballimi.api.mapper;

import com.shoeballimi.api.model.Brand;
import com.shoeballimi.api.model.Seller;
import com.shoeballimi.api.model.Shoes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoesMapper {

    Integer health();

    List<Shoes> findShoes();
    void saveShoes(Shoes shoes);

    void saveBrand(Brand brand);

    void saveSeller(Seller seller);
}
