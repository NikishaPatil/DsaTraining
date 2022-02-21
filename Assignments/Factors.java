package com.company;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        int num1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter num1: ");
        num1 = (int) in.nextInt();

        for(int i=1; i<=num1; ++i){
            if(num1%i==0){
                System.out.print(i+" ");

            }
        }
    }
}

