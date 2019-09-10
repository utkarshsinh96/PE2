package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class isEvenTest extends AppTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_01(){
        boolean excepted = true;
        boolean actual = isEven.isEven(16);
        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void test_02(){
        boolean excepted = false;
        boolean actual = isEven.isEven(15);
        Assert.assertEquals(actual, excepted);
    }

}