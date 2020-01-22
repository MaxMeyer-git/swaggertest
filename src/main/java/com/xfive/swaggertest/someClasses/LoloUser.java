package com.xfive.swaggertest.someClasses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@ApiModel
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usersss")
public class LoloUser {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int id;

    @ApiModelProperty(value = "Имя пользователя", required = true)
    @Column(name = "name", nullable = false)
    public String name;

    @ApiModelProperty(value = "Зп юзера", required = true)
    @Column(name = "salll", nullable = false)
    public int sal;
}

