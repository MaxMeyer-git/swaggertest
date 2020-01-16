package com.xfive.swaggertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@SpringBootApplication
public class SwaggertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggertestApplication.class, args);
    }

//    @Bean
//    public Docket swaggerConfig (){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(PathSelectors.ant("/rest/*"))
//                .apis(RequestHandlerSelectors.basePackage("com.xfive"))
//                .build();
//    }

    @Bean
    public Docket swaggerConfig (){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/rest/**"))
//                .apis(RequestHandlerSelectors.basePackage("com.xfive.swaggertest.controller"))
                .apis(RequestHandlerSelectors.basePackage("com.xfive"))
                .build()
                .apiInfo(getApiDetails());
    }

    private ApiInfo getApiDetails(){
        return new ApiInfo("Demand prediction APP",
                "Demand prediction APP based on AI",
                "1.0", "Top secret",
                new Contact("Nikolay", "@NTurkov", "nturkov@sbdagroup.com" ),
                "x5 license",
                "Тут должен быть сайт",
                Collections.emptyList());
    }

}
