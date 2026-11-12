import java.util.Arrays;
import java.util.Scanner;
 
public class Kuriyama_Mirai_s_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long []arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
 
        long prefix[] = new long[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        Arrays.sort(arr);
        long prefix2[] = new long[n];
        prefix2[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix2[i] = prefix2[i-1]+arr[i];
        }
        int m = sc.nextInt();
        while(m-->0){
            int type =sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (type == 1) {
                System.out.println((l == 1) ? prefix[r - 1] : prefix[r - 1] - prefix[l - 2]);
            } else {
                System.out.println((l == 1) ? prefix2[r - 1] : prefix2[r - 1] - prefix2[l - 2]);
            }
 
        }
    }
}