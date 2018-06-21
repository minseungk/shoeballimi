package com.shoeballimi.api.controller;

import com.shoeballimi.api.model.Shoes;
import com.shoeballimi.api.model.request.shoes.SaveShoesRequest;
import com.shoeballimi.api.service.ShoesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "슈발", description = "슈발 API")
public class ShoesController {

    @Autowired
    ShoesService shoesService;

    @GetMapping("/shoes")
    @ApiOperation("슈발 리스트 조회")
    public ResponseEntity<List<Shoes>> findAll() {
        return ResponseEntity.ok(shoesService.findAll());
    }

    @GetMapping("/shoes/{id}")
    @ApiOperation("슈발 조회")
    public ResponseEntity<Shoes> findById(
            @ApiParam(value="슈발 ID", required = true)
            @PathVariable Long id) {
        return ResponseEntity.ok(shoesService.findById(id));
    }

    @PostMapping("/stores/{storeId}/shoes")
    @ApiOperation("슈발 저장")
    public ResponseEntity<Void> saveShoes(
            @RequestBody SaveShoesRequest saveShoesRequest ,

            @ApiParam(value="상점 ID", required = true)
            @PathVariable Long storeId
    ) {
        shoesService.save(saveShoesRequest, storeId);
        return ResponseEntity.ok(null);
    }
//
//    @PutMapping("/shoes/{id}")
//    public ResponseEntity<Void> updateShoes() {
//        return ResponseEntity.ok(null);
//    }
//
//    @DeleteMapping("/shoes/{id}")
//    public ResponseEntity<Void> deleteShoes() {
//        return ResponseEntity.ok(null);
//    }

}
