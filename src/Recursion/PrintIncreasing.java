package Recursion;

import java.util.Scanner;

class print {
    static void printIncreasing (int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            printIncreasing(n);
        }

}


//class Demo{
//    void fun1(){
//        int x=1;
//        fun2();
//        System.out.println(x);
//    }
//    void fun2(){
//        int x=2;
//        fun3();
//        System.out.println(x);
//    }
//    void fun3(){
//        int x =3;
//        System.out.println(x);
//    }
//
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.fun1();
//    }
//}