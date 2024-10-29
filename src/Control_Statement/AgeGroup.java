package Control_Statement;
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an age:");
        int age = sc.nextInt();

        if(age < 10){
            System.out.println("Child");
        }else if( age >10 && age < 18){
            System.out.println("Teenegers");
        }else{
            System.out.println("Adult");
        }

    }
}
