package com.kodilla.testing.collection;

import java.lang.Integer;
import java.lang.System;
import java.util.*;

public class OddNumberExterminator {
   public  ArrayList<Integer> exterminate(ArrayList<Integer> inputArray){
        ArrayList<Integer> tempArray = new ArrayList<>();

        for(Integer number: inputArray) {
            if( (number % 2) == 0) {
                tempArray.add(number);
            }
        }
        return tempArray;
    }
}
