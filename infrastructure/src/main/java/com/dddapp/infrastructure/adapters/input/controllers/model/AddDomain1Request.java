package com.dddapp.infrastructure.adapters.input.controllers.model;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.dddapp.domain1.model.MyDomain1Entity;

import org.springframework.validation.annotation.Validated;

public class AddDomain1Request {

    @NotNull
    @NotEmpty
    private String name;

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
