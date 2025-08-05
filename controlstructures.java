package myproject;

public class controlstructures {
	public static void main(String[] args) {
        int x = 10;

        // if-else
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is 5 or less");
        }

        
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other Day");
        }

        
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop count: " + i);
        }

      
        int count = 1;
        while (count <= 3) {
            System.out.println("While loop count: " + count);
            count++;
        }
}
	}

