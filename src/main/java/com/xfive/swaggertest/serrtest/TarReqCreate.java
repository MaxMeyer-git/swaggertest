package com.xfive.swaggertest.serrtest;

import com.xfive.swaggertest.model.Authorizations;
import com.xfive.swaggertest.model.Functionality;

import java.util.*;

public class TarReqCreate {

    public void creationRequest (){


        Date date1 = new Date();
        Date date2 = new Date();
        List<String> list  = new ArrayList<>();
        list.add("fsdfsdf");
        list.add("fsdfsdf");
        list.add("fsdfsdf");
        List<Functionality> flist = new ArrayList<>();
        flist.add(Functionality.REPORT_DELETE);
        flist.add(Functionality.REPORT_VIEW);

        Authorizations authorizations = new Authorizations(UUID.randomUUID(),
                list,
                flist);
        Authorizations authorizations1 = new Authorizations(UUID.randomUUID(),
                list,
                flist);
        Authorizations authorizations2 = new Authorizations(UUID.randomUUID(),
                list,
                flist);

        List<Authorizations> la = new ArrayList<>();
        la.add(authorizations);
        la.add(authorizations2);
        la.add(authorizations1);

        Set<Functionality> functionality =  new HashSet<>();
        functionality.add(Functionality.PRODUCT_GROUP_ALL);
        functionality.add(Functionality.REPORT_VIEW);
        functionality.add(Functionality.REPORT_COPY);

//        var tarif = new TariffCreationRequest("Lol",
//                date1,
//                date2,
//                la,
//                false);
//
//        return tarif;


    }



}
