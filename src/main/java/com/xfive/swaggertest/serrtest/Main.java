package com.xfive.swaggertest.serrtest;

import com.xfive.swaggertest.someClasses.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


//        TarReqCreate tcr = new TarReqCreate();
//        TariffCreationRequest tariffCreationRequest = tcr.creationRequest();

        User user1 = new User(1, "vaus", 212);

        Configuration conf = new Configuration().configure();

        SessionFactory sessionFactory = conf.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user1);

        transaction.commit();
        session.close();
        sessionFactory.close();


    }

}
