package Loops;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();

//        Sum of following Series:
        int ans =0;
//
        for(int i=0;i<=n;i++){
            if(i%2 ==0){
                ans-=i;
            }else{
                ans+=i;
            }

        }
        System.out.println("The ans is :" +ans);

//        Factorial

//        int fact =1;
//        for(int i=1;i<=n;i++){
//            fact = fact*i;
//            System.out.println("factorial of "+i+":"+ fact);
//        }

//        To the Power:

//        int ans =1;
//        for(int i=1; i<=b;i++){
//            ans *=a;
//        }
//        System.out.println("Power is "+ans);


    }
}
