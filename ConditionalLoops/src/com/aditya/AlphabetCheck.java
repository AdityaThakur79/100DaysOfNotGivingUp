package com.aditya;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Alphabet");
        char ch = input.next().trim().charAt(0);

//        .trim() => removes extra space from the char
//        .charAt(0)=> gives the first Alphabet of the string

        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println(ch + " is a LowerCase Alphabet");
        } else if (ch >= 'A' && ch <='Z') {
            System.out.println(ch + " is an UpperCase Alphabet");
        }
        else
        {
            System.out.println("Enter a Valid Input");
        }

    }
}
