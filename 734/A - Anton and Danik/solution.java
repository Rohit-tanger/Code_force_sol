 
import java.util.Scanner;
 
public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
 
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') c1++;
            else {
                c2++;
            }
        }
        if(c1==c2){
            System.out.println("Friendship");
        } else if (c1>c2) {
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
    }
 
}