import java.util.*;
public class acsnedingorder {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("please enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("please insert the elements in the array");
         for(int i=0;  i<n; i++){
              a[i]=sc.nextInt();
            }
        for(int i=0;i<n-1;i++){
             for(int j=0;j<n-1-i;j++){
                 if(a[j]>a[j+1]){
                     int temp =a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
             }
            for (int index = 0; index < a.length; index++) {
                System.out.print(a[index]+" ");
            }
         
         sc.close();
    }
    
}
