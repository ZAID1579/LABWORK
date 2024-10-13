package w7;
import java.util.*;
public class factorial{
    public static int fact (int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
public static void main(String[] args){
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("please insert the value of n");
    n=sc.nextInt();
    System.out.println(fact(n));
}    
}
