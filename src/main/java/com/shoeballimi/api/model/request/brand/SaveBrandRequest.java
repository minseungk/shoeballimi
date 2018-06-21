package com.shoeballimi.api.model.request.brand;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel("브랜드 저장 모델")
public class SaveBrandRequest {

    @ApiModelProperty("이름")
    @NotEmpty
    private String name;
}
