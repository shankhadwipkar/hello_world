package BasicJava;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = sc.nextInt();
        System.out.println("enter your second number:");
        int num2 = sc.nextInt();
        int sum = num1+num2;

        System.out.println("Sum is:  " +sum);
    }
}
