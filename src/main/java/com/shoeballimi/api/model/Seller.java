package com.shoeballimi.api.model;

import com.shoeballimi.api.model.request.SaveBrandRequest;
import com.shoeballimi.api.model.request.SaveSellerRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("판매자")
public class Seller {

    @ApiModelProperty("아이디")
    private Long id;

    @ApiModelProperty("이름")
    private Long name;

    @ApiModelProperty("등록일")
    private LocalDateTime regDate;

    public Seller(SaveSellerRequest saveSellerRequest) {
        this.name = saveSellerRequest.getName();
        this.regDate = LocalDateTime.now();
    }

}
