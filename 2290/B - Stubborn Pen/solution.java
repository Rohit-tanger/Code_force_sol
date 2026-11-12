 
import java.util.Scanner;
 
public class Stubborn_Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int count =0;
            if(s.charAt(0)=='B'){
                count++;
            }
            for(int i=1;i<n;i++){
                char ch = s.charAt(i);
                 if(ch ==s.charAt(i-1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}