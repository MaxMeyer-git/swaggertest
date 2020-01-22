package com.xfive.swaggertest;

import com.xfive.swaggertest.serrtest.*;
import com.xfive.swaggertest.someClasses.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        TarReqCreate tcr = new TarReqCreate();
//        TariffCreationRequest tariffCreationRequest = tcr.creationRequest();

        ReportTypeGenerator rtg = new ReportTypeGenerator();
        List<ReportType> reportTypeList = rtg.crateList(10);

        Tariff tariff = new Tariff();

        List<ReportType> rtforTarriff = new ArrayList<>();
        rtforTarriff.add(reportTypeList.get(2));
        rtforTarriff.add(reportTypeList.get(3));
        rtforTarriff.add(reportTypeList.get(6));
        rtforTarriff.add(reportTypeList.get(5));

        tariff.setReportTypeWrappers(rtg.wraperList(rtforTarriff));

        tariff.setName("fsdfsdf");
//        tariff.getReportTypes().add(reportTypeList.get(1));
//        tariff.getReportTypes().add(reportTypeList.get(3));
//        tariff.getReportTypes().add(reportTypeList.get(5));


        Configuration conf = new Configuration().configure();
        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        reportTypeList.forEach(session::save);
        session.save(tariff);


        transaction.commit();
        session.close();
        sessionFactory.close();



    }

}
