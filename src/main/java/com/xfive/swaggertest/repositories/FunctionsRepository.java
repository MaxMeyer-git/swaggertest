package com.xfive.swaggertest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FunctionsRepository extends JpaRepository<Collection<String>, Collection<String>> {
//    String findByDescription (String description);

}
