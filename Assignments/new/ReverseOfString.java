import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.next();
        System.out.println("Enter second string: ");
        String str2 = sc.next();
        System.out.println(Reverse(str1, str2));
    }

    static boolean Reverse(String s1, String s2) {
        String str = "";
        for (int i = s1.length() - 1;i >=0; i--) {
            char ch = s1.charAt(i);
            str = str + ch;
        }
        if (str.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
