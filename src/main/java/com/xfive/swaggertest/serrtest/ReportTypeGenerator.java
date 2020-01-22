package com.xfive.swaggertest.serrtest;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class ReportTypeGenerator {

    private int count = 1;
    Random random = new Random();
    Integer rr;

    public ReportType create (){
        rr = 1000 + random.nextInt(1000);
        String xx =rr.toString();
        ReportType reportType = new ReportType();
        reportType.setRepid(count);
        reportType.setDescription(xx);
        count ++;
        return reportType;
    }

//    public ReportType create (int from ){
//        rr = 1000 + random.nextInt(1000);
//        String xx =rr.toString();
//        ReportType reportType = new ReportType();
//        reportType.setId(from);
//        reportType.setDescription(xx);
//        count ++;
//        return reportType;
//    }

    public List<ReportType> crateList (int amount){
        List<ReportType> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            list.add(create());
        }
        return list;

    }
//    public List<ReportType> crateList (int amount, int from ){
//        List<ReportType> list = new ArrayList<>();
//        for (int i = 1; i < amount; i++) {
//            list.add(create(from));
//        }
//        return list;
//
//    }


    public List<ReportTypeWrapper> wraperList (List<ReportType> reportTypeList) {

        List<ReportTypeWrapper> wraperList = new ArrayList<>() ;

        for (ReportType rep: reportTypeList) {
            ReportTypeWrapper reportTypeWrapper = new ReportTypeWrapper();
            ReportTypeId reportTypeId = new ReportTypeId();
            reportTypeId.setRepid(rep.getRepid());
            reportTypeId.setDescription(rep.getDescription());
            reportTypeWrapper.setId(reportTypeId);
            wraperList.add(reportTypeWrapper);
        }
        return wraperList;

    }
//    public ReportTypeWrapper wraperList (List<ReportType> reportTypeList) {
//        return new ReportTypeWrapper().setReportTypes(reportTypeList);
//
//    }

}
