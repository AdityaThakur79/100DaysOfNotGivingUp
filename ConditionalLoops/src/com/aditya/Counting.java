package com.aditya;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 456452;
        System.out.println(n + " Enter the number to be Checked");
        int num = input.nextInt();

        int count = 0;
        while(n>0)
        {
           int r = n % 10;

            if (r == num)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
