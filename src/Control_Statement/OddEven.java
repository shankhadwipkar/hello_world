package Control_Statement;
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number:");
        int num = sc.nextInt();
//        if ( num %2 ==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

        String result;
        result = (num%2 ==0) ? "Even" : "Odd";
        System.out.println(result);
    }
}