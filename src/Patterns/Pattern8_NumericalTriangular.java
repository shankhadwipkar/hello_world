package Patterns;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern8_NumericalTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
