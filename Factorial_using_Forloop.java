package core_java;

public class Factorial_using_Forloop {

	public static void main(String[] args) {
		
		int n = 5;
		int fact = 1;
		System.out.println("factorial of number "+n+" is");
		for ( int i = 1; i < n; i++) {
			fact *= i;
		}
			System.out.print(fact);

	}

}
