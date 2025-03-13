package Patterns;
import java.util.Scanner;

public class Pattern1_Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter no of column: ");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
