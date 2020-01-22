package com.xfive.swaggertest.controller;


import com.xfive.swaggertest.serrtest.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static com.google.common.base.Preconditions.checkArgument;

@Api(tags = {"Пользователи"}, consumes = "application/json; utf-8", produces = "application/json; utf-8")
@SwaggerDefinition(tags = {@Tag(name = "LoloUser", description = "LoloUser")})
@RestController
@RequestMapping ("/rest/user")
public class UsersResource {


    @PostMapping
//    @ValidateAuthToken
    public TariffCreationRequest create(
            @Validated @RequestBody TariffCreationRequest request) {

//        var tariff = tariffService.create(request);

        return request;
    }



//    @GetMapping ("/tariff")
//    public TariffCreationRequest getTarif () {
//
////        return new TarReqCreate().creationRequest();
//
//    }


//
//    @GetMapping ("/")
//    public List<LoloUser> getUsers() {
//        return Arrays.asList(
//                new LoloUser("Peter", 2000),
//                new LoloUser("Peter", 2000)
//        );
//    }
//
//
//    @GetMapping("/{userName}")
//    public LoloUser getUser(
//            @ApiParam (value = "UserName - enter a name to get it full profile")
//            @PathVariable("userName") final String userName) {
//        return new LoloUser(userName, 100);
//    }
//
//    @GetMapping
////            ("/{userName}")
//    public LoloUser getNewUser (
//            @RequestHeader(name = "Authorization") String token,
//
//            @RequestParam(value = "name", required = false, defaultValue = "Vasya")
//            @ApiParam(value = "Set some user name", example = "Vasya") String  name,
//
//            @RequestParam(value = "salary", required = false, defaultValue = "10")
//            @ApiParam(value = "Enter users salary", example = "32") Integer salary){
//
//        if (token.equals("test")){
//            return new LoloUser("Test person", 9999);
//
//        }if (token.equals("Secret")){
////            checkArgument(token != null );
//            return new LoloUser("пасхалка", 44);
//        }
//        else {
//            return new LoloUser(name, salary);
//        }
//    }


}
