package com.shoeballimi.api.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("브랜드 저장 모델")
public class SaveBrandRequest {

    @ApiModelProperty("이름")
    private Long name;
}
