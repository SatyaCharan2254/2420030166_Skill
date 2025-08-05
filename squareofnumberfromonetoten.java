package myproject;

import java.util.Scanner;

public class squareofnumberfromonetoten {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
   	    System.out.println("enter a: ");
   	    long a=sc.nextLong();
   	    long sum=0;
    	for(int i=1;i<a+1;i++){
   	    	long square=i*i;
   	        sum+=square;
   	    	
   	    }
    	System.out.println("Square of numbers is: "+sum);
    }
}
