package com.qltd.backend.repositories;

import com.qltd.backend.entity.GhiNo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 10/06/2018
*/
@Repository
public interface GhiNoRepository extends JpaRepository<GhiNo, Integer>, JpaSpecificationExecutor<GhiNo> {

}
