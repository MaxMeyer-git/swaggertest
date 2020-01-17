package com.xfive.swaggertest.someClasses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ApiModel
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hello {

    @ApiModelProperty(value = "Store some hello")
    String hello = "какое то Приветсвие";

    String someOtherHello = "Some other hello";

}
