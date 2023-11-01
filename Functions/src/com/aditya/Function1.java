package com.aditya;

import java.util.Scanner;

public class Function1 {
    //Q Take input of two numbers and print the sum

    //Syntax of a method in java
//    return_type method_name(arguments)
//    {
//        //body
//        return statement
//    }


    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Sum is = " +  ans);
    }

    static int sum(){
        Scanner input =new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter Num1");
        num1 = input.nextInt();
        System.out.println("Enter Num2");
        num2 = input.nextInt();
        sum = num1 + num2;
        return sum;
    }


}
