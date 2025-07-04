package core_java;

public class Throwsexception {
	void m1(int a, int b)throws ArithmeticException{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Throwsexception s = new Throwsexception();
		try {
			s.m1(10, 0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
		}

		
	}

}
