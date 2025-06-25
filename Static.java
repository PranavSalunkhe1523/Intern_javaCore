package core_java;

public class Static {
	void m1() {
		System.out.println("this is not Static");
		
		}
	
	static void m2() {
		//we directly can not call non static method in static
		
		System.out.println("this is Static");
	}
	
	public static void main(String []args) {
		Static a =new Static();
		a.m1();
		m2();
	}
}
