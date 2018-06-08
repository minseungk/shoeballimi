package com.shoeballimi.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shoeballimi.api.model.request.SaveShoesRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("슈발")
public class Shoes {

    @ApiModelProperty("아이디")
    private Long id;

    @ApiModelProperty("가격정보")
    private Long price;

    @ApiModelProperty("발매일")
    private LocalDateTime launchDate;

    @ApiModelProperty("등록일")
    private LocalDateTime regDate;

    @ApiModelProperty("마지막 수정일")
    private LocalDateTime updateDate;

    @ApiModelProperty("제품명")
    private String name;

    @ApiModelProperty("설명")
    private String description;

    @JsonIgnore
    private Long brandId;

    @ApiModelProperty("브랜드")
    private Brand brand;

    @JsonIgnore
    private Long sellerId;

    @ApiModelProperty("판매자")
    private Seller seller;

    public Shoes(SaveShoesRequest saveShoesRequest, Long brandId, Long sellerId) {
        this.price = saveShoesRequest.getPrice();
        this.launchDate = saveShoesRequest.getLaunchDate();
        this.regDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
        this.name = saveShoesRequest.getName();
        this.description = saveShoesRequest.getDescription();
        this.brandId = brandId;
        this.sellerId = sellerId;
    }
}
