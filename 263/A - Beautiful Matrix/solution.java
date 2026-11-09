//package CODEFORCE_DIY_150_QUESTION;
 
import java.util.Scanner;
 
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int arr[][] = new int[5][5];
         int a = 0;
         int b =0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    a=i;
                    b=j;
                }
            }
        }
        int moves = Math.abs(a-2)+Math.abs(b-2);
        System.out.println(moves);
    }
}