package com.dddapp.infrastructure.adapters.output.repository.model.domain1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dddapp.domain1.model.MyDomain1Entity;

/**
 * This class has the projection for database
 * 
 */
@Entity
@Table(name = "MY_MODEL_TABLE" )
public class MyDomain1Projection {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    public MyDomain1Projection() {}

    public MyDomain1Projection(String name) {
        this.name = name;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public MyDomain1Entity convertToModel() {
		return new MyDomain1Entity(this.name);
	}
}
