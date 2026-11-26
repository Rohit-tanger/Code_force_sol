 
import java.util.Scanner;
 
public class Translation {
//    public static void reverse(String s){
//        int i=0;
//        int j=s.length()-1;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev =sc.next();
        int n = s.length();
        if (s.length() != rev.length()) {
            System.out.println("NO");
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=rev.charAt(n-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}