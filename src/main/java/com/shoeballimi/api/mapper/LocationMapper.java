package com.shoeballimi.api.mapper;

import com.shoeballimi.api.model.Location;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LocationMapper {
    void findById(Long id);
    void save(Location location);
    void update(Location location);
    void delete(Long id);
}
