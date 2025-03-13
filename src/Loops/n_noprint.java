package Loops;
import java.util.Scanner;

public class n_noprint {
    public static void main(String[] args) {
        Scanner dwip = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = dwip.nextInt();

//        while loop
//        int num= 1;
//        while(num<=n){
//            System.out.println(num);
//            num++;
//            }

//    for loop
        for(int num=1;num<=n;num++){
            System.out.println(num);
        }

//        do-while loop
//        int num = 1;
//        do{
//            System.out.println(num);
//            num +=3;
//        }while(num<=n);


    }

}
