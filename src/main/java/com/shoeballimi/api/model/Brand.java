package com.shoeballimi.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shoeballimi.api.model.request.brand.SaveBrandRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@ApiModel("브랜드")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Brand {

    @ApiModelProperty("아이디")
    private Long id;

    @ApiModelProperty("상호명")
    private String name;

    @ApiModelProperty("등록일")
    private LocalDateTime regDate;

    public Brand(SaveBrandRequest saveBrandRequest) {
        this.name = saveBrandRequest.getName();
        this.regDate = LocalDateTime.now();
    }

}
