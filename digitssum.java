public class digitssum {
    public static void main(String[] args){
        int n=13;
        int sum=0;
        int isd;
        while(n>0){
            isd=n%10;
            sum=sum+isd;
            n=n/10;

        }System.out.println(sum);
    }
    
}
