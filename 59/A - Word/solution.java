 
import java.util.Scanner;
 
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // word ke uppar case aur lowercase kitne h check karo aur jo jyada h usme convert kar do pure ko
        int cl=0;
        int cu=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <=90) cu++;
            else cl++;
        }
        if(cu>cl){
            s =s.toUpperCase();
            System.out.println(s);
        }
        else{
            s=s.toLowerCase();
            System.out.println(s);
        }
    }
}