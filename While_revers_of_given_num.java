package core_java;

public class While_revers_of_given_num {
	public static void main(String[]args) {
		int n = 123;
		int revers = 0;
		
		
		while(n > 0) {
			revers = (revers*10)+ (n % 10);
			n = n / 10;
		}
		System.out.println("last digit is: "+revers);
	}

}
