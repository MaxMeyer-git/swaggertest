package com.xfive.swaggertest.serrtest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.swing.plaf.LabelUI;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ReportTypeWrapper")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportTypeWrapper  {

//    @Id
//    @GeneratedValue
//    @Column(name = "id")
//    private int id;


//    @EmbeddedId
//    private ReportType reportType;



//    List<Tariff> tariffs;

//    @Column(name = "repType")

    @EmbeddedId
//@Column(name = "repid")
private ReportTypeId repid;


//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "tariff_report_type", joinColumns = @JoinColumn(name = "tariff_id"),
//            inverseJoinColumns = {@JoinColumn(name = "repid"), @JoinColumn(name = "description")})
////            inverseJoinColumns = @JoinColumn(name = "description"))
//    @Column(name = "report_type_id", nullable = false)
//    @Fetch(FetchMode.SUBSELECT)
//    private List<ReportTypeId> reportTypeIdList;



}
