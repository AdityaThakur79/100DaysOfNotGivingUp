package com.aditya;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int marks=88;
        System.out.println("Is your Roll No 117?");
        String roll = input.next();
        if ( roll.equals("yes")  ) {
            System.out.println("You Have Obtained " + marks + "Marks");
        }
        else
        {
            System.out.println("You have failed!!!");
        }
    }
}
