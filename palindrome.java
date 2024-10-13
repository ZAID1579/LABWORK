
import java.util.*;

/**
 *
 * @author admin
 */
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("please enter a string of your choice");
        String s1=sc.nextLine();
        String rev="";
        for(i=s1.length()-1;i>=0;i--){
            rev+=s1.charAt(i);
            if(s1.charAt(i)==s1.charAt(s1.length()-1)){
                System.out.println("its not a palindrome");
                break;
            }else{
                System.out.println("its a palindrome");
            }
        }
    }
    
}
