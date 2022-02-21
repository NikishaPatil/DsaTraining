package com.company;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter num1: ");
        num1 = (int) in.nextInt();
        System.out.println("Please enter num2: ");
        num2 = (int) in.nextInt();

        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.println(num2);
    }
}
