package com.xfive.swaggertest.serrtest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportTypeId  implements Serializable {

//    @Id
    @Column(name = "repid")
    private int repid;

    @Column(name = "description")
    private String description;



}
