package com.xfive.swaggertest.someClasses;

import lombok.Getter;

import java.util.EnumSet;


@Getter
public enum TarifFunctionalities {
    REPORT_VIEW,
    REPORT_BUILD,
    REPORT_DELETE,
    REPORT_COPY,
    REPORT_EXPORT_PART,
    REPORT_EXPORT_FULL,
    PRODUCT_GROUP_ALL,
    SHOP_TREE_VIEW_TO_REGION,
    SHOP_TREE_VIEW_TO_CITY;
//    public static final EnumSet<TarifFunctionalities> AllPosibleFunctionalities = EnumSet.of(
//            REPORT_VIEW,
//            REPORT_BUILD,
//            REPORT_DELETE,
//            REPORT_COPY,
//            REPORT_EXPORT_PART,
//            REPORT_EXPORT_FULL,
//            PRODUCT_GROUP_ALL,
//            SHOP_TREE_VIEW_TO_REGION,
//            SHOP_TREE_VIEW_TO_CITY);

    public static EnumSet<TarifFunctionalities> BASE_FUNCTIONALITIES = EnumSet.of(
            REPORT_VIEW,
            REPORT_EXPORT_PART);


    public static EnumSet<TarifFunctionalities> BUILD_REPORT = EnumSet.of(
            REPORT_VIEW,
            REPORT_BUILD,
            REPORT_DELETE,
            REPORT_COPY,
            REPORT_EXPORT_PART,
            SHOP_TREE_VIEW_TO_REGION,
            PRODUCT_GROUP_ALL);

    public static EnumSet<TarifFunctionalities> SHOP_TREE_VIEW_TO_CITY_SET = EnumSet.of(
//            название сета прилось изменить т.к. оно конфликтует с енамом
            REPORT_VIEW,
            REPORT_EXPORT_PART,
            SHOP_TREE_VIEW_TO_CITY);

    public static EnumSet<TarifFunctionalities> FULL_REPORT_EXPORT = EnumSet.of(
            REPORT_VIEW,
            REPORT_EXPORT_PART,
            REPORT_EXPORT_FULL);


    public static EnumSet<TarifFunctionalities> getBuildReport(String setName) {
        if (setName == null)
            return BASE_FUNCTIONALITIES;
//            под вопросом, уточнить бизнес логику

        if (setName.equals("ALL_POSSIBLE_FUNCTIONALITIES"))
            return EnumSet.allOf(TarifFunctionalities.class);

        if (setName.equals("BUILD_REPORT"))
            return BUILD_REPORT;

        else return BASE_FUNCTIONALITIES;
    }
}
