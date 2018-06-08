package com.shoeballimi.api.model;

import com.shoeballimi.api.model.request.SaveBrandRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("브랜드")
public class Brand {

    @ApiModelProperty("아이디")
    private Long id;

    @ApiModelProperty("상호명")
    private Long name;

    @ApiModelProperty("등록일")
    private LocalDateTime regDate;

    public Brand(SaveBrandRequest saveBrandRequest) {
        this.name = saveBrandRequest.getName();
        this.regDate = LocalDateTime.now();
    }

}
