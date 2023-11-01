package com.aditya;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int day = input.nextInt();

        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid day number");
        }

//        also
        switch (day)
        {
            case 1,2,3,4,5-> System.out.println("Weekdays");
            case 6,7-> System.out.println("Weekends");
        }
    }
}
