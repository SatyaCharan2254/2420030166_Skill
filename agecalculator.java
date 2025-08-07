package myproject;
import java.time.*;
import java.util.Scanner;

public class agecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int year = sc.nextInt();
        System.out.println("Enter your birth month: ");
        int month = sc.nextInt();
        System.out.println("Enter your birth day: ");
        int day = sc.nextInt();
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        
        Period age = Period.between(dob, today);

       
        System.out.println("Your age is: " + age.getYears() +" years "+ age.getMonths() + " months  and "+ age.getDays() + " days.");
        
        
    }
}
