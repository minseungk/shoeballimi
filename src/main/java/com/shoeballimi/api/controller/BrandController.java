package com.shoeballimi.api.controller;


import com.shoeballimi.api.model.Brand;
import com.shoeballimi.api.model.request.brand.SaveBrandRequest;
import com.shoeballimi.api.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "브랜드", description = "브랜드 API")
public class BrandController {

    @Autowired
    BrandService brandService;

    @GetMapping("/brands")
    @ApiOperation("브랜드 리스트 조회")
    public ResponseEntity<List<Brand>> findAll() {
        List<Brand> brands = brandService.findAll();
        if (brands == null || brands.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(brandService.findAll());
    }

    @GetMapping("/brands/{id}")
    @ApiOperation("브랜드 조회")
    public ResponseEntity<Brand> findById(
            @ApiParam(value="ID", required = true)
            @PathVariable Long id
    ) {
        Brand brand = brandService.findById(id);
        if (brand == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(brand);
    }

    @PostMapping("/brands")
    @ApiOperation("브랜드 저장")
    public ResponseEntity<Void> save(@RequestBody SaveBrandRequest brand) {
        brandService.save(brand);
        return ResponseEntity.ok(null);
    }

//    @PutMapping("/brands/{id}")
//    public ResponseEntity<Void> update() {
//        return ResponseEntity.ok(null);
//    }
//
//    @DeleteMapping("/brands/{id}")
//    public ResponseEntity<Void> delete() {
//        return ResponseEntity.ok(null);
//    }


}
