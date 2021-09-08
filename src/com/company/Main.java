package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Exercise 2
        double celsius;
        double fahrenheit;
        final double formula = 1.8;
        final int formula_convert = 32;
        Scanner in = new Scanner(System.in);


        //Få brugeren til at skrive værdien
        System.out.print("Enter a temperature in Celsius: ");
        celsius = in.nextDouble();

        //Konverter til fahrenheit og vis resultat
        fahrenheit = ((celsius*formula)+formula_convert);
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);




    }
}
