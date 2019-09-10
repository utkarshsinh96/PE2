package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;
public class userTest {
    private static user user;
    @BeforeClass
    public static void setUp() throws Exception {
        user = new user();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
    @Test
    public void displayFullName() {
        String expected = "Utkarsh Sinh";
        String actual = user.getFullName("Utkarsh" , "Sinh");
        Assert.assertEquals(actual,expected);
    }
}