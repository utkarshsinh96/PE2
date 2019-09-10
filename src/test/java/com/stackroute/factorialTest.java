package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;

public class factorialTest extends AppTest {

    @Test
    public void UTC_01_validInput()
    {
        String expected = "720";
        String actual = factorial.fact(6);
        Assert.assertEquals(expected, actual);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}

