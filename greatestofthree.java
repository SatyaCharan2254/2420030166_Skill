package myproject;
import java.util.*;
public class greatestofthree {
      public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter a: ");
    	 int a=sc.nextInt();
    	 System.out.println("enter b: ");
    	 int b=sc.nextInt();
    	 System.out.println("enter c: ");
    	 int c=sc.nextInt();
    	 
         int greatest;  	 
    	 if(a>=b && a>=c) {
    		 greatest=a;
    	 }
    	 else if(b>=a && b>=c) {
    		 greatest=b;
    	 }
    	 else {
    		 greatest=c;
    	 }
    	 System.out.println("Greatest number is : " +greatest);
      }
}
