package com.dddapp.infrastructure.adapters.output.repository;

import com.dddapp.infrastructure.adapters.output.repository.model.domain1.MyDomain1Projection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * That class will access database and implements JPACrudRepository from spring
 * If implements JPACrudRepository will be an interface
 */
@Repository
public interface Domain1DAO extends JpaRepository<MyDomain1Projection, Long > {
    
    MyDomain1Projection findByName(String name);
}
