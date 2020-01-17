package com.xfive.swaggertest.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .useDefaultResponseMessages(false)
                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.ant("/rest/**"))
//                .apis(RequestHandlerSelectors.basePackage("com.xfive.swaggertest.controller"))
                .apis(RequestHandlerSelectors.basePackage("com.xfive"))
                .build()
                .apiInfo(getApiDetails());
    }

    private ApiInfo getApiDetails() {
        return new ApiInfoBuilder()
                .title("Demand prediction APP")
                .description("Demand prediction APP based on AI")
                .contact(new Contact("Nikolay", "@NTurkov", "nturkov@sbdagroup.com"))
                .version("0.001")
                .build();
    }
}
