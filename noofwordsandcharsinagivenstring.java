package myproject;
import java.util.*;
public class noofwordsandcharsinagivenstring {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String str = sc.nextLine();
        String str1[]=str.split(" ");
     	System.out.println(str1.length);
		str = str.replace(" ", "");
		char ch[]=str.toCharArray();
		System.out.println(ch.length);
    }
}
