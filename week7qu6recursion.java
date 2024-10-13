package w7;
import java.util.Scanner;
public class week7qu6recursion {
    public static void fibonacci(int n,int first,int seccond){
    if(n==1)
        return;
       
        int next= first+seccond;
    first=seccond;
    seccond=next;
        System.out.println(next);
     fibonacci(n-1,first,seccond);     
     return ;
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the fibonacci series is  "+ 1);
      fibonacci(n,0,1);
    }
}