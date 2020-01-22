package com.xfive.swaggertest.serrtest;

import com.xfive.swaggertest.model.ReportType;
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
@Table(name = "reporttypewrapper")
@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportTypeWrapper {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


//    @EmbeddedId
//    private ReportType reportType;


//    List<Tariff> tariffs;

//    @Column(name = "repType")

    //    @EmbeddedId
//@Column(name  = "repid")
//    @Column(name = "report_id")
//    @JoinTable(name="rt_tar", joinColumns={@JoinColumn(name="report_idddd",
//            referencedColumnName="report_id")}
//            , inverseJoinColumns={@JoinColumn(name="report_type", referencedColumnName="ID")})


    private int repid;




//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "tariff_report_type", joinColumns = @JoinColumn(name = "tariff_id"),
//            inverseJoinColumns = {@JoinColumn(name = "repid"), @JoinColumn(name = "description")})
////            inverseJoinColumns = @JoinColumn(name = "description"))
//    @Column(name = "report_type_id", nullable = false)
//    @Fetch(FetchMode.SUBSELECT)
//    private List<ReportTypeId> reportTypeIdList;


}
