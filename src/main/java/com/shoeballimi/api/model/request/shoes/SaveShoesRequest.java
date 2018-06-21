package com.shoeballimi.api.model.request.shoes;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ApiModel("슈발 저장 모델")
public class SaveShoesRequest {

    @ApiModelProperty("가격정보")
    private Long price;

    @ApiModelProperty("발매일")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate launchDate;

    @ApiModelProperty("제품명")
    private String name;

    @ApiModelProperty("설명")
    private String contents;
}
