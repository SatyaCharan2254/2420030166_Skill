package myproject;
import java.util.*;
public class sumofdigits {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter a: ");
    	 long a=sc.nextLong();
    	 long sum=0;
    	 while (a>0){
    		 long digit= a%10;
    		 sum+=digit;
    		 a=a/10;
    	 }
    	 System.out.println("Sum of digits is: "+sum);
     }
}
