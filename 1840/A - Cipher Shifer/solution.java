 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
 
public class Cipher_Shifer {
 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
          StringBuilder ans = new StringBuilder();
            int i=0,j=1;
            while( i <n && j<n){
                if(s.charAt(i)==s.charAt(j)){
                    ans.append(s.charAt(i));
                    i=j+1;
                    j=i+1;
                }
                else {
                    j++;
                }
            }
            System.out.println(ans);
        }
    }
}