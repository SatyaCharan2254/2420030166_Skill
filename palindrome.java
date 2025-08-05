package myproject;
import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        int length= str.length();
        String strrev = "";
        for (int i = length- 1; i >= 0; i--) {
            strrev += str.charAt(i);
        }

        if (str.contentEquals(strrev)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}
