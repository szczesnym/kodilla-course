package com.kodilla.testing;

import com.kodilla.testing.calculator.*;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania");
        Calculator simpleCalculator = new Calculator();

        int resultAdd = simpleCalculator.add(5, 9);
        int resultSubtract = simpleCalculator.subtract(5, 9);

        if( resultAdd == 14 ) {
            System.out.println("Test ADD -> OK");
        } else {
            System.out.println("Test ADD -> FAILED");
        }
        if( resultSubtract == -4 ) {
            System.out.println("Test SUBTRACT -> OK");
        } else {
            System.out.println("Test SUBTRACT -> FAILED");
        }
    }
}
