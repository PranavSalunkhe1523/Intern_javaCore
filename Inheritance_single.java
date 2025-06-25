package core_java;

class A {
	void m1() {
		System.out.println("this is a super class method");
	}
}
	
	
class B extends A {
	void m2() {
		System.out.println("this is m2 method");
	}
}

public class Inheritance_single{
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}
}


