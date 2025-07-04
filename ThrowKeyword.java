package core_java;

public class ThrowKeyword {
	void m1(int a, int b) {
		if (b==0) {
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}
		
	}
	
	public static void main(String[]args) {
		ThrowKeyword s = new ThrowKeyword();
		s.m1(10, 0);
		
	}

}
