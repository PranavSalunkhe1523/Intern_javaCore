package core_java;

public class Exception_hand {

	public static void main(String[] args) {
		
		System.out.println("platominds");
		int a = 10;
		//System.out.println(a/0);
		
		try {
			System.out.println(a/0);
		}catch(ArithmeticException e) {
		System.out.println(e);	
		System.out.println("divided by zero is not allowed");
		}
	}

}
