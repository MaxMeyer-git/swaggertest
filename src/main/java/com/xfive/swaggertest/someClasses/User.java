package com.xfive.swaggertest.someClasses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Getter
@Setter
@AllArgsConstructor
public class User {

        @ApiModelProperty(value = "Имя пользователя", required = true)
        String name;

        @ApiModelProperty(value = "Зп юзера", required = true)
        int sal;

        public void doSomething (){

        }
}
