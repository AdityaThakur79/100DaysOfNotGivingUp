package com.aditya;

public class Function4 {
//    Swapping of two numbers
public static void main(String[] args) {
    int a=10;
    int b=20;
    System.out.println(a);
    System.out.println(b);
    swap(a,b);
}

   static void swap(int a, int b)
    {
        int temp;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);

    }

}
