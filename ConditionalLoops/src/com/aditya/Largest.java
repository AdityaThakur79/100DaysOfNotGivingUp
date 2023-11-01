package com.aditya;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(); //2 5 6
        int n2 = input.nextInt();
        int n3 = input.nextInt();

       int max =n1;

       if(max < n2)
       {
           max = n2;
       }
       if(max < n3)
       {
           max = n3;
       }
        System.out.println(max);

    }
}
