package com.company;
import java.util.Scanner;

public class LinearSort {
    public static void main(String[] args) {
        int n, i, item, c = 0;
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter: ");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter Elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Emter the element to find: ");
        item = sc.nextInt();

        for (i = 0; i < a.length; i++) {
            if (a[i] == item) {
                c++;
                break;
            }
        }

        if (c > 0) {
            System.out.print("Item exist");
        } else {
            System.out.print("Item does not exist");
        }
    }
}
