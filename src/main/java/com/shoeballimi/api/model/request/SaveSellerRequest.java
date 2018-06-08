package com.shoeballimi.api.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("판매자 저장 모델")
public class SaveSellerRequest {

    @ApiModelProperty("이름")
    private Long name;
}
