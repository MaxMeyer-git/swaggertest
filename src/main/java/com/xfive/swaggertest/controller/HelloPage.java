package com.xfive.swaggertest.controller;

import com.xfive.swaggertest.someClasses.Hello;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/hello")
public class HelloPage {


    @GetMapping ("/")
    @ApiOperation(value = "Возврощает хелоу ворлд", notes = "важная заметка", response = String.class)
    public String hello (){
        return new Hello().getHello();
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return "success";
    }


    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }




}
