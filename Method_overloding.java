package core_java;

public class Method_overloding {
	void sum (int a) {
		System.out.println(a+a);
	}
	
	void sum (double a) {
		System.out.println(a+a);
	}

	public static void main(String[] args) {
		Method_overloding  s1 = new Method_overloding();
		s1.sum(4);
		s1.sum(10.4);
	}

}
