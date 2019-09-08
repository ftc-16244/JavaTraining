package com.example.javaexamplecode;

import java.util.Scanner;

public class SubtractNumbers {

    public static void main(String args[])  {
        int x, y, z;

        System.out.println("Enter two integers to calculate their difference");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = x - y;

        System.out.println("Difference of the integers = " + z);
    }

}
