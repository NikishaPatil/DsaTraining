public class StringPermutation {

    public static void main(String[] args) {
        String s = "abc";
        printPermutation(s, " ");
    }

    static void printPermutation(String str, String c) {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(c + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String r = str.substring(0, i) + str.substring(i + 1);
            printPermutation(r, c + ch);
        }
    }
}
