package com.company;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter num1: ");
        num1 = (int) in.nextInt();
        System.out.println("Please enter num2: ");
        num2 = (int) in.nextInt();

        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
        System.out.println("After Swapping");

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
    }
}
