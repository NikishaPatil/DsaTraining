import java.util.Scanner;

public class SumofDigitsinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String s = sc.next();

        int n = Integer.parseInt(s);
        System.out.println(sumDigit(n));
    }

    public static int sumDigit(int sum){
        if(sum==0){
            return 0;
        }
        return sum%10 + sumDigit(sum/10);
    }
}