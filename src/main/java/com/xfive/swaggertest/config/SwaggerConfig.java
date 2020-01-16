package com.xfive.swaggertest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

//@Configuration
public class SwaggerConfig {


//    @Bean
//    public Docket swaggerConfig (){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(PathSelectors.ant("/rest*"))
////                .apis(RequestHandlerSelectors.basePackage("com.xfive.swaggertest/controller"))
//                .apis(RequestHandlerSelectors.basePackage("com.xfive.swaggertest.controller"))
////                .apis(RequestHandlerSelectors.basePackage("com.xfive"))
//                .build()
//                .apiInfo(getApiDetails());
//    }
//
//    private ApiInfo getApiDetails(){
//        return new ApiInfo("Demand prediction APP",
//                "Demand prediction APP based on AI",
//                "1.0", "Top secret",
//                new Contact("Nikolay", "@NTurkov", "nturkov@sbdagroup.com" ),
//                "x5 license",
//                "Тут должен быть сайт",
//                Collections.emptyList());
//    }



}
