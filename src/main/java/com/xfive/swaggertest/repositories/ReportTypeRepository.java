package com.xfive.swaggertest.repositories;

import com.xfive.swaggertest.model.ReportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReportTypeRepository extends JpaRepository<List<ReportType>, List<UUID>> {

    List<ReportType> findAllByOrderByIdAsc();
}
