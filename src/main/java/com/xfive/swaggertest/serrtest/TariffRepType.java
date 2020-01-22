package com.xfive.swaggertest.serrtest;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "tariff_report_type")
public class TariffRepType {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "tariff_id")
    private UUID tariffId;

    @OneToMany
    @Column(name = "report_type_id")
    private UUID reportTypeId;


}
