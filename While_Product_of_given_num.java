package core_java;

public class While_Product_of_given_num {
	public static void main(String[]args) {
		int num = 123;
		int product = 1;
		
		while(num > 0) {
			product = product * num%10;
			num = num/10;
		}
		System.out.println("the product is: "+product);
	}
}
