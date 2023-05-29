package com.epam.langSyntax;

public class DigitsSumCalculator {

    public static void calculateSum(int number) {
        System.out.println((int)(Math.floor(number/1000) + Math.floor(number/100)%10 + Math.floor(number/10)%10 + number%10));
    }

}
