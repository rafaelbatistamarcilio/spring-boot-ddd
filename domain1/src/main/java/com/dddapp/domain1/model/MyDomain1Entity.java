package com.dddapp.domain1.model;

/**
 * Domain entity (NOT A JPA ENTITY !!!!) Encapsulate businnes rules WITHOU
 * FRAMEWORK CODE!!! JUST
 */
public class MyDomain1Entity {
    private String name;

    public MyDomain1Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validate() throws Domain1Exception {
        if (this.name == null || this.name.isEmpty()) {
            throw new Domain1Exception("name is required");
        }
    }
}
