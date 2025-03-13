package Control_Statement;
import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Value:");
        int value = sc.nextInt();

        if(value%5 ==0 || value%3 ==0){
            System.out.println("ans is  " +value);
        }
    }
}
