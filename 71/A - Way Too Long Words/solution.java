 
import java.util.Scanner;
 
public class Way_too_long_words {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=0){
            String s = sc.nextLine();
            // 10 se jyada wale and 1 and last ke beech men
            int count =0;
            
                    if(s.length() >10){
                        count = s.length()-2;
                        System.out.println(s.charAt(0) + ""+count+ ""+s.charAt(s.length()-1)+"");
                    }
           else{
               System.out.println(s);
                    }
        }
    }
 
 
}