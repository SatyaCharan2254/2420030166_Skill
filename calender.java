package myproject;
import java.util.*;
public class calender {
     public static void main(String arr[]) {
    	 Calendar c=Calendar.getInstance();
    	 Date d=c.getTime();
    	 System.out.println(d);
    	 c.set(2023,c.SEPTEMBER,13);
    	 int year=c.getWeekYear();
    	 System.out.println(year);
    	 int h=c.getFirstDayOfWeek();
    	 System.out.println(h);
     }
}
