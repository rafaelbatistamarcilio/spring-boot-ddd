package com.dddapp.infrastructure.config;

import com.dddapp.domain1.interfaces.IDomain1Repository;
import com.dddapp.domain1.interfaces.IDomain1Service;
import com.dddapp.domain1.services.Domain1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Autowired
    private IDomain1Repository domain1Repository;
    
    @Bean({"service"}) 
    public IDomain1Service domainServiceCOnfig() {
        return new Domain1Service(domain1Repository);
    }
}
