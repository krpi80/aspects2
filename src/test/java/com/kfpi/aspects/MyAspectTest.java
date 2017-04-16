package com.kfpi.aspects;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyAspectTest {

    @Test
    public void shouldWeaveAspect() {
        new SimpleBean();
        assertTrue("Aspect has not been used!", MyAspect.beforeInitSimpleBeanCalled);
    }

}
