package myproject;
import java.util.*;

public class payment_gateway {

    void cash(double amount, double cashGiven) {
        if (cashGiven >= amount) {
            System.out.println("Cash payment successful. Change: ₹" + (cashGiven - amount));
        } else {
            System.out.println("Not enough cash.");
        }
    }

    void upi(double amount, String upiId) {
        System.out.println("UPI payment of ₹" + amount + " via " + upiId + " successful.");
    }

    void card(double amount, String cardNumber) {
    	System.out.println("Card payment of ₹" + amount + " via " + cardNumber + " successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        payment_gateway ob = new payment_gateway();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        

        System.out.println("Choose method: 1. Cash  2. UPI  3. Card");
        int method = sc.nextInt();
      

        if (method == 1) {
            System.out.print("Enter cash given: ");
            double cash = sc.nextDouble();
            ob.cash(amount, cash);

        } else if (method == 2) {
            System.out.print("Enter UPI ID: ");
            String upi = sc.nextLine();
            ob.upi(amount, upi);

        } else if (method == 3) {
            System.out.print("Enter card number: ");
            String card = sc.nextLine();
            ob.card(amount, card);

        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
