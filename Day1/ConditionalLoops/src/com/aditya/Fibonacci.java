package com.aditya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter the range");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int t1 = 0;
        int t2 = 1;
        System.out.println(t1);

        for (int i=1 ; i<=n ;i++)
        {
            int t3 = t1+t2;
            System.out.println(t3);
            t1=t2;
            t2=t3;
        }
    }


}
