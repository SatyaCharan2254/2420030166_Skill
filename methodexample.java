package myproject;

public class methodexample {
	public int display() {
		int a=10;
		return a;
		
	}
    public static void main(String[] args) {
    	methodexample ob=new methodexample();
    	int b=ob.display();
    	System.out.println(b);
    	System.out.println(ob.display());
    	
    }
}
