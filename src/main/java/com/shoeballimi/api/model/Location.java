package com.shoeballimi.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel("위치")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {
    private Long id;
    private Double longitude;
    private Double latitude;
    private String type;

    public Location(Double longitude, Double latitude, String type) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
    }
}
