 
import java.util.Arrays;
import java.util.Scanner;
 
public class Lex_String {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            char []a1 =a.toCharArray();
            char []b1 =b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            StringBuilder sb = new StringBuilder();
            int acnt =0,bcnt =0;
            int i=0,j=0;
            while(i<n && j<m){
              if(bcnt==k || (a1[i]<b1[j] && acnt<k)){
                  sb.append(a1[i]);
                  i++;
                  acnt++;
                  bcnt=0;
              }
              else{
                  sb.append(b1[j]);
                  j++;
                  bcnt++;
                  acnt =0;
              }
            }
            System.out.println(sb.toString());
        }
    }
}