package myproject;

import java.util.Scanner;

public class Sumfunction {
     public int sum(int a, int b) {
    	 
    	return a+b; 
     }
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter a: ");
         int a=sc.nextInt();
         System.out.print("Enter b: ");
         int b=sc.nextInt();
         Sumfunction ob= new Sumfunction();
         int c= ob.sum(a, b);
         System.out.println("SUM of a and b is "+c);
        		 
         
     }
}
