package com.xfive.swaggertest.controller;


import com.xfive.swaggertest.someClasses.User;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping ("/rest/user")
public class UsersResource {

    @GetMapping ("/")
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Peter", 2000L),
                new User("Peter", 2000L)
        );
    }


    @GetMapping("/{userName}")
    public User getUser(
            @ApiParam (value = "UserName - enter a name to get it back")
            @PathVariable("userName") final String userName) {
        return new User(userName, 100L);
    }


}
