import java.util.Scanner;
 
public class Picnic_for_two {
    public static long gcd(long a, long b) {
 
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while (t-- > 0) {
            long l = sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();
            long gcda =gcd(a,l);
            long gcdb = gcd(b,l);
            long lcm = gcda/gcd(gcda,gcdb)*(gcdb);
            long count = l/lcm;
            System.out.println(count);
        }
    }
}