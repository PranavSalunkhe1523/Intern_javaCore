package core_java;
	
class vehical {
	void start() {
	System.out.println("verical start");
	}
}
	
class bike extends vehical{
	void m1() {
		System.out.println("bike is started");
	}
}
	
class car extends vehical{
	void m2() {
		System.out.println("car is started");
	}
}
	
public class Inhetitance_hierarchi {
	public static void main(String[] args) {
		bike b = new bike();
		b.start();
		b.m1();
		
		car c = new car();
		c.start();
		c.m2();
	}

}
