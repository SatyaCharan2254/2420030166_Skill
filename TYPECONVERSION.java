package myproject;

public class TYPECONVERSION {
	public static void main(String[] args) {
        // Implicit conversion
        int x = 10;
        double y = x; // int to double
        System.out.println("Implicit conversion (int to double): " + y);

        // Explicit conversion
        double p = 9.7;
        int q = (int) p; // double to int
        System.out.println("Explicit conversion (double to int): " + q);
    }
}
