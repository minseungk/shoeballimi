package com.shoeballimi.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.shoeballimi.api.model.request.store.SaveStoreRequest;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@ApiModel("판매점")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Store {
    private Long id;
    private String name;
    private String tel;
    private Location location;
    private LocalDateTime regDate;

    @JsonIgnore
    private Long brandId;

    private Brand brand;

    public Store(SaveStoreRequest storeRequest, Long brandId) {
        this.name = storeRequest.getName();
        this.tel = storeRequest.getTel();
        this.location = new Location(storeRequest.getLongitude(), storeRequest.getLatitude(), this.getClass().getSimpleName());
        this.brandId = brandId;
        this.regDate = LocalDateTime.now();
    }
}
