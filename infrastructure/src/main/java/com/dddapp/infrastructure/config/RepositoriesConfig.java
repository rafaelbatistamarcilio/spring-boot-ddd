package com.dddapp.infrastructure.config;

import com.dddapp.domain1.interfaces.IDomain1Repository;
import com.dddapp.infrastructure.adapters.output.repository.MemoryDomain1Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoriesConfig {
    
    @Autowired 
    private MemoryDomain1Repository memoryDomain1Repository;

    @Bean({"domain1Repository"})
    public IDomain1Repository domain1Repository() {
        return memoryDomain1Repository;
    }
}
