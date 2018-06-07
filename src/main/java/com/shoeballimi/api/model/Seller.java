package com.shoeballimi.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Seller {

    @ApiModelProperty("아이디")
    private Long id;

    @ApiModelProperty("이름")
    private Long name;

    @ApiModelProperty("등록일")
    private LocalDateTime regDate;

}
