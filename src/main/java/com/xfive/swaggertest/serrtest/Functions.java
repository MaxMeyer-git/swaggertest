package com.xfive.swaggertest.serrtest;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collection;
import java.util.List;

public enum Functions  {
    BUILD_REPORT (List.of(
            Functionality.REPORT_VIEW,
            Functionality.REPORT_BUILD,
            Functionality.REPORT_DELETE,
            Functionality.REPORT_COPY,
            Functionality.REPORT_EXPORT_PART,
            Functionality.SHOP_TREE_VIEW_TO_REGION,
            Functionality.PRODUCT_GROUP_ALL
    )),
    SHOP_TREE_VIEW_TO_CITY (List.of(
            Functionality.REPORT_VIEW,
            Functionality.REPORT_EXPORT_PART,
            Functionality.SHOP_TREE_VIEW_TO_CITY
    )),
    FULL_REPORT_EXPORT (List.of(
            Functionality.REPORT_VIEW,
            Functionality.REPORT_EXPORT_PART,
            Functionality.REPORT_EXPORT_FULL
    ));

    private final List<Functionality> functionalities;

    Functions(List<Functionality> functionalities) {
        this.functionalities = functionalities;
    }

    @JsonValue
    public List<Functionality> getFunctionalityList() {
        return functionalities;
    }

    public boolean containsFunctionality(Functionality functionality) {
        return functionalities.contains(functionality);
    }
}
