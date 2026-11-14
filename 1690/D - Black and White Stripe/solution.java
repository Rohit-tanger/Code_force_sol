import java.util.Scanner;
 
public class Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int countw =0;
 
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W'){
                    countw++;
                }
            }
            int min =countw;
            for(int i=k;i<n;i++){
                if(s.charAt(i)=='W'){
                    countw++;
                }
                if(s.charAt(i-k)=='W'){
                    countw--;
                }
                min = Math.min(min,countw);
            }
            System.out.println(min);
        }
    }
}