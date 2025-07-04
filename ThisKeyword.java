package core_java;

class A{
	int i ;
	
	void m1(int i) {
		this.i = i;
	}
	
	void m2() {
		System.out.println(i);
	}
}

public class ThisKeyword {
	public static void main(String[]args) {
		A s = new A();
		s.m1(10);
		s.m2();
	}

}
