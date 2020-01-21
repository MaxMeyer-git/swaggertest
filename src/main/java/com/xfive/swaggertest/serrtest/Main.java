package com.xfive.swaggertest.serrtest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        TarReqCreate tcr = new TarReqCreate();
        TariffCreationRequest tariffCreationRequest = tcr.creationRequest();

        Configuration con = new Configuration().configure().addAnnotatedClass(TariffCreationRequest.class);
//        Configuration con = new Configuration().configure().addAnnotatedClass("src/main/java/com/xfive/swaggertest/hibernate.cfg.xml");

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(tariffCreationRequest);
        tx.commit();



    }

}
