package com.shoeballimi.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket mobileApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("모바일 API")
                .description("사용설명 http://wiki.encar.io/api/x/GYCw")
                .version("v1")
                .license("API Team")
                .licenseUrl("http://wiki.encar.io/api/display/API")
                .termsOfServiceUrl("http://wiki.encar.io/api/display/API")
                .build();

        String[] consumes = {"application/json"};
        Set<String> consumesSet = new HashSet<>(Arrays.asList(consumes));

        return new Docket(DocumentationType.SWAGGER_2)
//                .directModelSubstitute(LocalDateTime.class, Long.class)
//                .directModelSubstitute(LocalDate.class, Long.class)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .consumes(consumesSet)
                .apiInfo(apiInfo);
    }

}