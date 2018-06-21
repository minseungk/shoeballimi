package com.shoeballimi.api.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel("이미지")
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private String id;
    private String seq;
    private String domain;
    private String path;
    private String url;
}
