package com.example.CalculadoraExemple;

/**
 * Class which implements the basic functionality of a calculator.
 * @author Ferran Calabuig Herrero
 */
public class Calculator {


    /**
     * 
     * @param a first number
     * @param b second number
     * @return sum of vot params
     */
public int add (int a, int b){

return a + b;

}

/**
 * 
 * @param a first number
 * @param b second number
 * @return  susbtraction of both params
 */
public int substract(int a, int b){

    return a - b;

}

/**
 * 
 * @param a first
 * @param b second
 * @return product of both params
 */
public  int multiply (int a, int b){

    return a * b;

}

/**
 * 
 * @param a first
 * @param b second
 * @return division result of params
 */
public int divide(int a, int b){

    if(b == 0){

        System.out.println("divider can't be zero.");
    }

    return a/b;

}



}
