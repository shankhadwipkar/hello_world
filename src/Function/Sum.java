package Function;
import java.util.Scanner;
class Algebra{
    int add(int a,int b){
        int ans =a+b;
        return ans;
    }

}
public class Sum {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum of the input is ");
        int ans =obj.add(x,y);
        System.out.println(ans);
    }
}
