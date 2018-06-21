package com.shoeballimi.api.controller;


import com.shoeballimi.api.model.Store;
import com.shoeballimi.api.model.request.store.SaveStoreRequest;
import com.shoeballimi.api.service.StoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "상점", description = "상점 API")
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping("/stores")
    @ApiOperation("상점 리스트 조회")
    public ResponseEntity<List<Store>> findAll() {
        return ResponseEntity.ok(storeService.findAll());
    }

    @GetMapping("/stores/{id}")
    @ApiOperation("상점 조회")
    public ResponseEntity<Store> findById(
            @ApiParam(value="ID", required = true)
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(storeService.findById(id));
    }

    @PostMapping("/brands/{brandId}/stores")
    @ApiOperation("상점 저장")
    public ResponseEntity<Void> saveStore(
            @RequestBody SaveStoreRequest saveStoreRequest
            ,

            @ApiParam(value="브랜드 ID", required = true)
            @PathVariable Long brandId) {
        System.out.print(saveStoreRequest.getName());
        storeService.save(saveStoreRequest, brandId);
        return ResponseEntity.ok(null);
    }
//
//    @PutMapping("/stores/{id}")
//    public ResponseEntity<Void> updateStore() {
//        return ResponseEntity.ok(null);
//    }
//
//    @DeleteMapping("/stores/{id}")
//    public ResponseEntity<Void> deleteStore() {
//        return ResponseEntity.ok(null);
//    }
}
