import java.util.Scanner;
public class MoveXtoEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String s = "";
        System.out.println(shiftChar(s,str));
    }

    static int count = 0;
    public static String shiftChar(String a, String str1 ){
        if(str1.isEmpty()){
            for(int i=0;i<count;i++){
                a = a + 'x';
            }
            return a;
        }
        char ch = str1.charAt(0);
        if( ch == 'x'){
            count++;
            return shiftChar( a, str1.substring(1));
        }else{
            return shiftChar( a + ch,str1.substring(1));
        }
    }
}
