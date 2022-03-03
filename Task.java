import java.util.Scanner;
import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the input type: Integer or String or Exit");
            String input;
            input = sc.next();

            switch (input) {
                case "Integer": {
                    System.out.println("1. Reverse the number");
                    System.out.println("2. Check if palindrome or not");
                    System.out.println("3. Armstrong number or not");
                    int i = sc.nextInt();
                    System.out.println("Enter the number : ");
                    int num = sc.nextInt();

                    if (i == 1) {
                        reverse(num);
                    } else if (i == 2) {
                        palindrome(num);
                    } else if (i == 3) {
                        Armstrongnumber(num);
                    }
                    break;

                }

                case "String": {
                    System.out.println("1. Subsequence of a string");
                    System.out.println("2. Permutation of sting in sorted order");
                    System.out.println("3. Print all possible palindromic partitions");
                    int p = sc.nextInt();
                    System.out.println("Enter the String: ");
                    String str = sc.next();

                    if (p == 1) {
                        subsequence("", str);
                    } else if (p == 2) {
                        permutation("", str);
                    } else if (p == 3) {
                        printpartition(str);

                    }
                    break;
                }

                case "Exit":
                    return;

            }
        }
    }

    public static void reverse(int num) {

        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }


    public static void palindrome(int num) {
        int rem, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }
    }


    public static void Armstrongnumber(int num) {
        int number, temp, total = 0;
        number = num;

        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }

        if (total == num) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }

    public static void subsequence(String s, String str) {
        if (str.isEmpty()) {
            System.out.println(s);
            return;
        }

        char ch = str.charAt(0);
        subsequence(s, str.substring(1));
        subsequence(s + ch, str.substring(1));
    }


    public static void permutation(String s, String str) {
        if (str.isEmpty()) {
            System.out.println(s);
            return;
        }

        char ch = str.charAt(0);
        for (int i = 0; i <= s.length(); i++) {
            String r = s.substring(0, i);
            String p = s.substring(i, s.length());
            permutation(r + ch + p, str.substring(1));
        }
    }


    public static void printpartition(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j<= str.length(); j++){
                String s = str.substring(i,j);
                if(isPalindrome(s) == true){
                    System.out.println(s);
                }
            }
        }
    }


    public static boolean isPalindrome( String s){
        int i = 0;
        int j = s.length() - 1;

        while( i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
            return true;
        }
}




