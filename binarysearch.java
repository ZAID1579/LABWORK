import java.util.*;
public class binarysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("please enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("please insert the elements in the array");
        for(i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        int s= 0;
        int e=a.length-1;
        System.out.println("please insert the elements for search");
        int p=sc.nextInt();
        while(s<=e){
        int mid=(e+s)/2;
        if(p==a[mid]){
            System.out.println("element found at index "+mid);
            break;
        }else if(p>a[mid]){
            s=mid+1;
        }else{
            e=mid-1;
        }
        sc. close();
    }
    }   
}
