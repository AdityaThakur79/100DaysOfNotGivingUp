package com.aditya;

import java.util.Objects;
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Fruit Name");
        String fruit = input.next();

        if (fruit.equals("mango"))
        {
            System.out.println("Mango is the king of fruits");
        }
        if (fruit.equals("apple"))
        {
            System.out.println("An apple a day keeps doctor away");
        }

    }
}
