package com.kodilla.testing.collection;

//import com.kodilla.testing.collection.*;
import org.junit.Assert;
import org.junit.*;
import java.lang.Integer;
import java.lang.System;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test List Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test List Case: end");
    }
    @Test
    public void testExterminateEmptyList() {
        //Given
        ArrayList <Integer> testArrayList = new ArrayList<>();
        //When
        OddNumberExterminator testExterminator = new OddNumberExterminator();
        ArrayList <Integer> resultArrayList = testExterminator.exterminate(testArrayList);
        //Then
        Assert.assertTrue(resultArrayList.isEmpty());
    }
    @Test
    public void testExterminateNotEmptyList() {
    }
}
