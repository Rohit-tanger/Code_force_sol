 
import java.util.Arrays;
import java.util.Scanner;
 
public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sc1 =0,sc2=0;
        int l=0,r=n-1;
 
        int [] score = new int[2]; // 0 for score1 and 1 for score2
        int turn =0;
 
        while(l<=r){
            int chosencard =0;
 
            if(arr[l]<arr[r]){
                chosencard=arr[r];
                r--;
            }
            else{
               chosencard=arr[l];
                l++;
            }
            score[turn%2] +=chosencard;
            turn++;
        }
        System.out.println(score[0] +" "+ score[1]);
    }
}