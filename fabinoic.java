package w7;
import java.util.*;
public class fabinoic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the value of n");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("the fabinoic series is"+a+" " +b);
        for(int i=1;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }

    }

    
}
