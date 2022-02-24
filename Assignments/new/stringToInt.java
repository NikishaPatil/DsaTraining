
public class stringToInt {
    public static void main(String[] args) {
        String s = "1256";
        int n = s.length();
        System.out.print(conversion(s, n));

    }

    public static int conversion(String s, int n) {
        if (n == 1) {
            return s.charAt(0) - '0';
        }
        return (10 * conversion(s, n - 1) + s.charAt(n - 1) - '0');
    }
}