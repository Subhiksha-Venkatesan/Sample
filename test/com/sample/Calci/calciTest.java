package com.sample.Calci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calciTest {
    @Test
    public void testAddPass(){
        assertEquals(3,calculator.add(2,1));
        assertEquals(-3,calculator.add(-2,-1));
        assertEquals(-1,calculator.add(0,-1));
    }
    @Test
    public void testAddFail(){
        assertNotEquals(0,calculator.add(2,1));
    }
    @Test
    public void testSubPass(){
        assertEquals(-2,calculator.sub(-4,-2));
        assertEquals(-6,calculator.sub(-4,+2));
        assertEquals(12,calculator.sub(10,-2));
    }
    @Test
    public void testMulPass(){
        assertEquals(0,calculator.mul(0,0));
        assertEquals(-20,calculator.mul(4,-5));
        assertEquals(10,calculator.mul(-2,-5));
        assertEquals(0,calculator.mul(4,0));
    }
    @Test
    public void testDivPass() {
        assertEquals(5.4,calculator.div(16,3),0.1);
        assertEquals(0,calculator.div(0,2));
        assertEquals(0,calculator.div(16,0));
    }
}
