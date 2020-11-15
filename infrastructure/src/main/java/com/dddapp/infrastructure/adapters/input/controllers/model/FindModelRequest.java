package com.dddapp.infrastructure.adapters.input.controllers.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NotNull(message = "search parameter required")
public class FindModelRequest {

    @NotBlank(message = "name is required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
