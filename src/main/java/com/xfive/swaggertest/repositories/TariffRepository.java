package com.xfive.swaggertest.repositories;

import com.xfive.swaggertest.model.ReportType;
import com.xfive.swaggertest.model.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface TariffRepository extends JpaRepository<Tariff, UUID> {
    String UNIQUE_NAME_CONSTRAINT = "uc_tariff_name";

//    @Query("select t.reportTypes from Tariff t where t.id = :tariffId")
    List<ReportType> reportTypesByTariffId(@Param("tariffId") UUID tariffId);
}
