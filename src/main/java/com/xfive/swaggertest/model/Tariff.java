package com.xfive.swaggertest.model;

import com.xfive.swaggertest.serrtest.ReportTypeWrapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tariff")
@Getter
@Setter
@NoArgsConstructor
public class Tariff {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

//    private Date startDate;
//
//    private Date endDate;
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "tariff_report_type", joinColumns = @JoinColumn(name = "tariff_id"),
//            inverseJoinColumns = @JoinColumn(name = "report_type_id"))
//    @Column(name = "report_type_id", nullable = false)
//    @Fetch(FetchMode.SUBSELECT)
//    private List<ReportType> reportTypes;

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
////    @JoinTable(name = "tariff_report_type", joinColumns = @JoinColumn(name = "tariff_id"),
//////            inverseJoinColumns = {@JoinColumn(name = "repid"), @JoinColumn(name = "description")})
////            inverseJoinColumns = @JoinColumn(name = "repid"))
////    @Column(name = "report_type_id")
////    @Fetch(FetchMode.SUBSELECT)

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "tariff_id" , referencedColumnName = "tariff_id")
    private List<ReportTypeWrapper> reportTypeWrappers;


//    private ReportTypeWrapper reportTypeWrapper;

//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "tariff_product_tree_plain_node",
//            joinColumns = {@JoinColumn(name = "tariff_id")},
//            inverseJoinColumns = {@JoinColumn(name = "code"), @JoinColumn(name = "level")})
//    @Fetch(FetchMode.SUBSELECT)
//    private List<ProductTreePlainNode> nodes;   // todo: refactor to ui4 using only
//
//
//    private List<Functionality> functions;
//
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "tariff_report_type_function", joinColumns = @JoinColumn(name = "tariff_id"),
//            inverseJoinColumns = @JoinColumn(name = "report_type_id"))
//    @Column(name = "report_type_id", nullable = false)
//    @Fetch(FetchMode.SUBSELECT)
//    private List<Authorizations> authorizations;
//
//    @Column(name = "build_for_format_x_only")
//    private boolean buildForFormatXOnly;

//    public Tariff(String name, Date startDate, Date endDate, List<Authorizations> authorizations,
//                  boolean buildForFormatXOnly) {
//        this.name = name;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.authorizations = authorizations;
//        this.buildForFormatXOnly = buildForFormatXOnly;
//}

//    public Tariff(String name, List<ReportType> reportTypes, List<ProductTreePlainNode> nodes, boolean buildForFormatXOnly,
//                  Date startDate, Date endDate, List<TarifFunctionalities> authorizations) {
//        this.name = name;
//        this.reportTypes = reportTypes;
//        this.nodes = nodes;
//        this.buildForFormatXOnly = buildForFormatXOnly;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.authorizations = (ArrayList<TarifFunctionalities>) authorizations;
//    }

//    private List<TariffReportTypeAndID> reportTypeToReportTypeAndID (List<ReportType> rtList){
//        List<TariffReportTypeAndID> result = new ArrayList<>();
//
//        rtList.forEach(reportType -> result.add(new TariffReportTypeAndID(reportType, this.id)));
//
//
//    }
}
