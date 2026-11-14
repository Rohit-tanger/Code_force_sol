 
import java.util.Scanner;
 
public class Serval_and_Inversion_Magic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s  =sc.next();
 
            boolean isdiff = false;
            int mismatch=0;
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n-i-1)){
                    if(!isdiff) {
                        isdiff = true;
                        mismatch++;
                    }
                }
                else{
                    isdiff=false;
                }
            }
            if(mismatch<=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}