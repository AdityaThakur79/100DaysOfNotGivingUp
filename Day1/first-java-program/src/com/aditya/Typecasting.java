package com.aditya;

public class Typecasting {
    public static void main(String[] args) {

        //This is called TypeCasting
        int num = (int) (88.88f);
        System.out.println(num);

        //Automatic Type Promotion in Expressions
        //1 byte = 256 so if we store an integer value bigger than the memory of byte it prints the reminder
        //Integer number - 256 = output

        //300-256=44
        int num2 = 300;
        byte b1 = (byte) (num2);
        System.out.println(b1);

        //257-256=1
        int num3 = 257;
        byte b2 = (byte) (num3);
        System.out.println(b2);

        //256-256=0
        int num4=256;
        byte b3 = (byte) num4;
        System.out.println(b3);

        //156-256=-100
        int num5=156;
        byte b4 = (byte) num5;
        System.out.println(b4);

        int num6 = 'A';
        System.out.println(num6);

        int num7 = 'a';
        System.out.println(num7);

    }
}
