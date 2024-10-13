/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author admin
 */
public class reverse {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string of your choice");
        String s1=sc.nextLine();
        String rev="";
        for(i=s1.length()-1;i>=0;i--){
            rev+=s1.charAt(i);
            
        }System.out.println(rev);
    }
    
}
