package myproject;
import java.util.*;
public class legacyclass {
      public static void main(String args[]) {
    	  Date d=new Date();
    	  System.out.println("current date is" +d);
    	  int month=d.getMonth();
    	  System.out.println("month");
    	  int year=d.getYear();
    	  System.out.println("year");
    	  System.out.println(d.getMinutes());
    	  System.out.println(d.getHours());
    	  
      }
}
