package com.aditya;

import java.util.Scanner;

//Fruit describes
//Enhanced Switch Case Statements
public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any fruit name");
        String fruit =  input.next();

        switch (fruit) {
            case "mango" -> System.out.println("Mango is the king of fruits");
            case "apple" -> System.out.println("Apple is a healthy fruit");
            case "banana" -> System.out.println("It is yellow in Color");
            default -> System.out.println("Enter a valid fruit name");
        }

    }
}
