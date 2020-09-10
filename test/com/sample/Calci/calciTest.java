package com.sample.Calci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calciTest {
    @Test
    public void testAddPass(){
        assertEquals(3,calculator.add(2,1));
    }
    @Test
    public void testAddFail(){
        assertNotEquals(0,calculator.add(2,1));
    }
    @Test
    public void testSubPass(){
        assertEquals(-2,calculator.sub(-4,-2));
    }
    @Test
    public void testMulPass(){
        assertEquals(20,calculator.mul(4,5));
    }
    @Test
    public void testDivPass() throws Exception {
        assertEquals(5.4,calculator.div(16,3),0.1);
    }
}
