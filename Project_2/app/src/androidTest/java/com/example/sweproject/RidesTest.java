package com.example.sweproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RidesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void driver1_test() throws Exception {
        Rides ride = new Rides();
        String result = ride.driver1();
        String expected = "John Smith";
        assertEquals(expected,result);
    }
    @Test
    public void driver2_test() throws Exception {
        Rides ride = new Rides();
        String result = ride.driver2();
        String expected = "Amy Singh";
        assertEquals(expected,result);
    }
    @Test
    public void driver3_test() throws Exception {
        Rides ride = new Rides();
        String result = ride.driver3();
        String expected = "Ryan Garcia";
        assertEquals(expected,result);
    }
}