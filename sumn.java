import java.util.*;
public class sumn {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        double  n=sc.nextDouble();
        double sum=0;
        for(i=1;i<n;i++){
            sum=sum+1/n;
        }System.out.println(sum);
    }

    
}
