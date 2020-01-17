package com.xfive.swaggertest.controller;


import com.xfive.swaggertest.someClasses.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

@Api(tags = {"Пользователи"}, consumes = "application/json; utf-8", produces = "application/json; utf-8")
@SwaggerDefinition(tags = {@Tag(name = "User", description = "User")})
@RestController
@RequestMapping ("/rest/user")
public class UsersResource {

    @GetMapping ("/")
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Peter", 2000),
                new User("Peter", 2000)
        );
    }


    @GetMapping("/{userName}")
    public User getUser(
            @ApiParam (value = "UserName - enter a name to get it full profile")
            @PathVariable("userName") final String userName) {
        return new User(userName, 100);
    }

    @GetMapping
//            ("/{userName}")
    public User getNewUser (
            @RequestHeader(name = "Authorization") String token,

            @RequestParam(value = "name", required = false, defaultValue = "Vasya")
            @ApiParam(value = "Set some user name", example = "Vasya") String  name,

            @RequestParam(value = "salary", required = false, defaultValue = "10")
            @ApiParam(value = "Enter users salary", example = "32") Integer salary){

        if (token.equals("test")){
            return new User("Test person", 9999);

        }if (token.equals("Secret")){
//            checkArgument(token != null );
            return new User("пасхалка", 44);
        }
        else {
            return new User(name, salary);
        }
    }


}
