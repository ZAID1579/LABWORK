public class pph {
    public static void main(String[] args){
        int i;
        int count;
        int n;
        
        for(i=0;i<=100;i++){
            count = 0;
            for(n=1;n<=i;n++){
                if(i%n==0){
                    count++;
                }
            }
            //System.out.println(count);
            if(count==2){
                    System.out.println(i);
                }
            }
        
    }
}
    

