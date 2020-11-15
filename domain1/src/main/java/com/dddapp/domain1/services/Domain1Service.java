package com.dddapp.domain1.services;

import com.dddapp.domain1.interfaces.IDomain1Repository;
import com.dddapp.domain1.interfaces.IDomain1Service;
import com.dddapp.domain1.model.Domain1Exception;
import com.dddapp.domain1.model.MyDomain1Entity;

public class Domain1Service implements IDomain1Service {

    private IDomain1Repository domain1Repository;

    public Domain1Service(IDomain1Repository domain1Repository) {
        this.domain1Repository = domain1Repository;
    }

    @Override
    public MyDomain1Entity findByName(String name) {
        return this.domain1Repository.findByName(name);
    }

    @Override
    public MyDomain1Entity add(MyDomain1Entity entity) throws Domain1Exception {
        if(entity == null) {
            throw new Domain1Exception("Domain is required");
        }
        entity.validate();
        return this.domain1Repository.add(entity);
    }
}