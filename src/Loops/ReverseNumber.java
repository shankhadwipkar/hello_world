package Loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner dwip = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n= dwip.nextInt();
        int ans =0;

        while(n>0){
            ans = ans*10 +n%10;
            n =n/10;
        }
        System.out.println("Reverse no is = "+ans);




    }
}
