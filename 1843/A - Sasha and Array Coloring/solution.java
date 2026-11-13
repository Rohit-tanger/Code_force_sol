 
import java.util.Arrays;
import java.util.Scanner;
 
public class Sasha_and_Array_Coloring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
           int c1 =0;
            for (int i = 0; i < n/2; i++) {
                 c1 = c1 +( arr[n - i-1] - arr[i]);
 
            }
            System.out.println(c1);
        }
    }
}