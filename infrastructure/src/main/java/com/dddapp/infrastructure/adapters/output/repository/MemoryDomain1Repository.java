package com.dddapp.infrastructure.adapters.output.repository;

import com.dddapp.domain1.interfaces.IDomain1Repository;
import com.dddapp.domain1.model.MyDomain1Entity;
import com.dddapp.infrastructure.adapters.output.repository.model.domain1.MyDomain1Projection;

import org.springframework.stereotype.Repository;

/**
 * Implements the domain repository interface
 */
@Repository
public class MemoryDomain1Repository implements IDomain1Repository {

    private Domain1DAO domain1DAO;

    public MemoryDomain1Repository(Domain1DAO domain1DAO) {
        this.domain1DAO = domain1DAO;
    }

    @Override
    public MyDomain1Entity findByName(String name) {
        var entity = this.domain1DAO.findByName(name);
        return entity != null ? entity.convertToModel() : null;
    }

    @Override
    public MyDomain1Entity add(MyDomain1Entity entity) {
        var projection = new MyDomain1Projection(entity.getName());
        var newEntity = this.domain1DAO.save(projection);
        return new MyDomain1Entity(newEntity.getName());
    }
    
}
