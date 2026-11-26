import java.util.HashMap;
import java.util.Scanner;
 
public class Boy_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
 
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
            if (map.size() % 2 ==0){
                System.out.print("CHAT WITH HER!");
                return;
            }
            else{
                System.out.print("IGNORE HIM!");
                return;
            }
 
    }
}