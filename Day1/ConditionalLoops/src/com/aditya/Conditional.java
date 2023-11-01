package com.aditya;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        if(age>=18)
        {
            System.out.println("You Can Drive");
        } else if (age==12) {
            System.out.println("12 ka h bhai tu abhi");
        }
        else{
            System.out.println("Saale Paida to ho le achese");
        }

    }
}
