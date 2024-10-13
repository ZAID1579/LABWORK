import java.util.*;
public class insert {
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("please inset the element in the array");
       for(i=0;i<n;i++){
       a[i]=sc.nextInt();}
       for(i=0;i<n;i++){
        a[i]=a[i]*10;


       }System.out.println(a[i]);
    }
    
}
