package Recursion;

public class Fibonacci {
    static int fib(int n){
//        Base case
        if (n==0 || n==1){
            return n;
        }
//        sub problem
        int pre = fib(n-1);
        int preprev = fib(n-2);

        int ans = pre+preprev;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));

    }

}
