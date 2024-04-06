package com.jsw.certificates.Factory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FactoryRepository extends JpaRepository<FactoryModel,Long> {

    @Query(value = "select fm from FactoryModel fm where fm.certificate_no=:certificate_no")
    FactoryModel getDetails(@Param("certificate_no") String certificate_no);
}
