import java.util.Scanner;
 
public class Numbers_on_Whiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(2);
            int current =n;
            for(int i=n-1;i>=1;i--){
                System.out.println(current +" "+i);
                current  = (current+i+1)/2;
            }
        }
    }
}