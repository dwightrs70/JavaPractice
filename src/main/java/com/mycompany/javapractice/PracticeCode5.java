/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javapractice;

import java.util.Scanner;

/**
 *
 * @author dwightsage
 */
public class PracticeCode5 {
    static void Solution() {
        ReverseStringWithRecursion();
    }
    
    static void ReverseStringWithLoop() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a string:");
        String inputString = input.nextLine();

        String reverseString = "";
        
        for (int i = inputString.length() - 1; i > -1; i--) {
            reverseString += inputString.substring(i, i + 1);
        }
        
        System.out.println(reverseString);
    }
    
    static void ReverseStringWithRecursion() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a string:");
        String inputString = input.nextLine();
        
        System.out.println(ReverseString(inputString));
    }
    
    static String ReverseString(String inputString) {
        if (inputString.length() == 1)
            return inputString;
        else
            return ReverseString(inputString.substring(1)) + inputString.substring(0, 1);
    }
    
    static String ReverseStringUsingLastCharacter(String inputString) {
        if (inputString.length() == 1)
            return inputString;
        else
            return inputString.substring(inputString.length() - 1) + ReverseString(inputString.substring(0, inputString.length() - 1));
    }
    
    static void AddDigitsWithModulus() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a number:");
        int firstNumber = input.nextInt();
        
        int total = 0;

        while (firstNumber != 0) {
            total += firstNumber % 10;
            
            firstNumber /= 10;
        }
        
        System.out.println("The sum of the digits is : " + total);
    }
    
    static void AddDigitsWithCharacterArray() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a number:");
        int firstNumber = input.nextInt();
        
        String firstNumberString = Integer.toString(firstNumber);
        
        int total = 0;
        
        for (char c: firstNumberString.toCharArray()) {
            total += Character.getNumericValue(c);
        }
        
        System.out.println("The sum of the digits is : " + total);
    }
    
    static void DisplayJavaVersion() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
    
    static void SimpleLoop() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a number:");
        int firstNumber = input.nextInt();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(firstNumber + " x " + i + " = " + (firstNumber * i));
        }
    }
    
    static void SimpleInput() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input first number:");
        int firstNumber = input.nextInt();
        
        System.out.println("Input second number:");        
        int secondNumber = input.nextInt();
        
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
    }
    
    static void SimpleDivision() {
        System.out.println(50/3);
    }
    
    static void SimpleAddition() {
        System.out.println(74 + 36);
    }
    
    static void HelloWorld() {
        System.out.println("Hello World\nDwight Sage");
    }
}
