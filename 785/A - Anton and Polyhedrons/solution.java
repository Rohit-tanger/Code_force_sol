 
import java.util.Scanner;
 
public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n-- >0) {
 
            String s = sc.next();
            if (s.equals("Tetrahedron")) {
                sum += 4;
            } else if (s.equals("Cube")) {
                sum += 6;
            } else if (s.equals("Octahedron")) {
                sum += 8;
            } else if (s.equals("Dodecahedron")) {
                sum += 12;
            } else { // "Icosahedron"
                sum += 20;
            }
        }
            System.out.println(sum);
 
    }
}