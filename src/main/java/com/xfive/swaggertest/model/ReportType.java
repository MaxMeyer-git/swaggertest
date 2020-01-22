package com.xfive.swaggertest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "report_type")
@Getter
@Setter
@NoArgsConstructor
public class ReportType implements Serializable  {

    public static final UUID CATEGORY_DIAGNOSIS = UUID.fromString("69dd6296-cd47-4874-84ed-857250e03fb5");
    public static final UUID CATEGORY_DIAGNOSIS_OPTIMIZED = UUID.fromString("867b814b-2fc7-4322-b1c0-0f9eb85ca28b");
    private static final UUID REPERTOIRE_OF_PURCHASE = UUID.fromString("93103b18-fa37-4b74-8f57-b6691c0ea2cf");
    private static final UUID SOURCE_OF_SALE = UUID.fromString("9ae54773-6020-4bab-90c6-bbedde748054");
    private static final UUID CUSTOMER_MIGRATION = UUID.fromString("61acf812-a5a5-423c-a825-66f60c199f13");
    private static final UUID CUSTOMER_MIGRATION_OPTIMIZED = UUID.fromString("748efb3c-8d02-4691-b82e-49de628e8a65");
    private static final UUID EFFICIENCY_OF_NEW_LAUNCH = UUID.fromString("d31233e6-f596-4c2b-bd72-6ab2fedd3b83");

    @Id
    @Column(name = "id")
    private int repid;

    @Column(name = "description")
    private String description;

    // возможно это не нужно
//    @OneToMany(mappedBy = "tariff")
//    private Set<TariffReportTypeAndID> tariffReportTypeAndIDSet = new HashSet<>();


    public static boolean isCategoryDiagnosis(UUID typeId){
        return (CATEGORY_DIAGNOSIS.equals(typeId) || CATEGORY_DIAGNOSIS_OPTIMIZED.equals(typeId));
    }

    public static boolean isRepertoireOfPurchases(UUID typeId){
        return REPERTOIRE_OF_PURCHASE.equals(typeId);
    }

    public static boolean isSourceOfSale(UUID typeId){
        return SOURCE_OF_SALE.equals(typeId);
    }

    public static boolean isCustomerMigration(UUID typeId){
        return (CUSTOMER_MIGRATION.equals(typeId) || CUSTOMER_MIGRATION_OPTIMIZED.equals(typeId));
    }

    public static boolean isEfficiencyOfNewLaunch(UUID typeId){ return EFFICIENCY_OF_NEW_LAUNCH.equals(typeId);}

}
