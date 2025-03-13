package Patterns;
import java.util.Scanner;

public class Pattern9_NumericalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int r=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.println(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l<=1;l++){
                System.out.print(l);
            }
        }
        System.out.println();

    }
}





