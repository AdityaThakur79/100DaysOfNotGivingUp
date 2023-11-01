package com.aditya;

import java.util.Scanner;

public class Function3 {
//    Arguments
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter num1");
    int num1 = input.nextInt();

    System.out.println("Enter num2");
    int num2 = input.nextInt();

    int ans = sum(num1,num2);
    System.out.println("Sum is = " + ans);
}

static int sum(int a,int b)
{
    return a+b;
}
}
