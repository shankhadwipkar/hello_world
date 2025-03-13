package Loops;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value: ");
        int n  =sc.nextInt();
        int num =0;
        int original_n =n;

        while(n>0){
            n=n/10;
            num++;
        }
        System.out.println("Number of digits in " + original_n + " = " + num);

    }
}
