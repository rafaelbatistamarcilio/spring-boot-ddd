package com.dddapp.domain1.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyModelTest {
    
    @Test
    public void mustRunTest() {
        var myModel = new MyDomain1Entity("pedro");
        assertEquals("pedro", myModel.getName());
    }
    
    @Test
    public void mustIdentifyInvalidDomain() {
        var myModel = new MyDomain1Entity(null);
        Assertions.assertThrows(Domain1Exception.class, ()-> myModel.validate());
    }
}
