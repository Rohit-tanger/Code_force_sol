 
import java.util.Scanner;
 
public class Ilya_and_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
            String str = sc.next();
            int n=str.length();
            int m = sc.nextInt();
        int prefix[] = new int[n];
 
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]; // jo just phele tak h wahi uska naswer h
 
            if(str.charAt(i)==str.charAt(i-1)){
                prefix[i]++;// agar same ataa h to add kar do
            }
        }
            while(m-->0){
                int k1 = sc.nextInt();
                int k2 = sc.nextInt();
                int ans = prefix[k2-1] - prefix[k1-1];
                System.out.println(ans);
        }
 
    }
}