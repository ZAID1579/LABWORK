import java.util.*;
public class nsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number till which you want the sum of");
        int n=sc.nextInt();
        int sum=0;
        int i;
        for(i=0;i<=n;i++){
            sum+=i;
            System.out.println(sum);
        }
    }
    
}
