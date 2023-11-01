package com.aditya;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in Degree Celcius");
        float degInC = input.nextInt();

        //Celcius in F
        float degInF = (degInC*9/5) + 32 ;
        System.out.println("The Temperature in F is " + degInF);

        //Celcius in Kelvin
        float degInK = degInC + 273.15f;
        System.out.println("The Temperature in F is " + degInK);
    }


}
