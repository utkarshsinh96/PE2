package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest extends AppTest {
   private  static  Reverse reverse;

    @Before
    public void setUp() throws Exception {
        reverse = new Reverse() ;

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_01(){
        int excepted = 12345;
        int actual = reverse.reverse(54321);
        Assert.assertEquals(actual, excepted);


    }

    @Test
    public void test_02(){
        int excepted = 12321;
        int actual = reverse.reverse(12321);
        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void test_03(){
        int excepted = 12345;
        int actual = reverse.reverse(54322);
        Assert.assertNotEquals(actual, excepted);
    }

    @Test
    public void test_04(){

        int actual = reverse.reverse(54322);
        Assert.assertNotNull(actual);
    }
}