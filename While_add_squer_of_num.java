package core_java;

public class While_add_squer_of_num {
	public static void main(String[]args) {
		int n = 123;
		int sum = 0;
		
		while(n > 0) {
			sum = sum + (n %10) *  (n %10);
			n = n/10;
			
		}
		System.out.println("the sum squar is  : "+sum);
	}

}
