package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class power4Test extends AppTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_01(){
        boolean excepted = true;
        boolean actual = power4.power4(16);
        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void test_02(){
        boolean excepted = true;
        boolean actual = power4.power4(32);
        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void test_03(){
        boolean excepted = false;
        boolean actual = power4.power4(30);
        Assert.assertEquals(actual, excepted);
    }



}