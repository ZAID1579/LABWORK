public class swap {
    public static void main(String[] args){
        int a[]={2,4,5,8};
        int size=4;
        int temp=0;
        int i;
        
           temp=a[0];
            a[0]=a[size-1];
            a[size-1]=temp;
        System.out.println("array after swapping is");
      for(i=0;i<size;i++){
        System.out.println(a[i]);
      }    
    
    }
    }
    

