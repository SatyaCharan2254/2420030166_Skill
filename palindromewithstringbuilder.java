package myproject;

import java.util.*;

public class palindromewithstringbuilder {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter a word: ");
         String str = sc.nextLine();
         StringBuilder sb=new StringBuilder(str);
         sb.reverse();
         if(str.contentEquals(sb)) {
        	 System.out.println("Is Palindrome");
         }
         else {
        	 System.out.println("Is not Palindrome");
         }
         
     }
}
