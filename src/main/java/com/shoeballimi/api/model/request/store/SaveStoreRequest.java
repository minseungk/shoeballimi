package com.shoeballimi.api.model.request.store;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("판매자 저장 모델")
public class SaveStoreRequest {

    @ApiModelProperty("이름")
    private String name;
    @ApiModelProperty("전화번호")
    private String tel;
    @ApiModelProperty("경도")
    private Double longitude;
    @ApiModelProperty("위도")
    private Double latitude;

}
