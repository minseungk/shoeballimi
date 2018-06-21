package com.shoeballimi.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.shoeballimi.api.model.request.shoes.SaveShoesRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@ApiModel("슈발")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shoes {

    @ApiModelProperty("아이디")
    private Long id;

    @ApiModelProperty("콘텐츠")
    private String contents;

    @ApiModelProperty("가격정보")
    private Long price;

    @ApiModelProperty("발매일")
    private LocalDate launchDate;

    @ApiModelProperty("등록일")
    private LocalDateTime regDate;

    @ApiModelProperty("마지막 수정일")
    private LocalDateTime updateDate;

    @ApiModelProperty("제품명")
    private String name;

    @JsonIgnore
    private Long storeId;

    @ApiModelProperty("판매자")
    private Store store;

    private List<Image> images;

    public Shoes(SaveShoesRequest saveShoesRequest, Long storeId) {
        this.price = saveShoesRequest.getPrice();
        this.launchDate = saveShoesRequest.getLaunchDate();
        this.regDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
        this.name = saveShoesRequest.getName();
        this.contents = saveShoesRequest.getContents();
        this.storeId = storeId;
    }
}
