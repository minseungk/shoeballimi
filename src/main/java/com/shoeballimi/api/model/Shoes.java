package com.shoeballimi.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("신발")
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

    @ApiModelProperty("판매자")
    private Seller seller;
}
