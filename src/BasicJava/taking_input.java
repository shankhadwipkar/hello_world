package BasicJava;
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your percent");
        Double percent =sc.nextDouble();


        System.out.println("Enter your lucky number:");
        int num=sc.nextInt();
        System.out.println("Name is "+name);
        System.out.println("Percent is "+percent);
        System.out.println("Lucky num is "+num);

    }


}
