package myproject;
import java.util.*;
public class divisionfunction {
	public void division(int a ,int b) {
		int c=a/b;
		
		System.out.println("Division is "+c);
		
	}
	public void multiply(int a ,int b) {
		int c=a*b;
		System.out.println("product is "+c);
		}
	public static void main(String[] args) {
   	 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        divisionfunction ob= new divisionfunction();
        ob.division(a,b);
        ob.multiply(a,b);
        }
}
