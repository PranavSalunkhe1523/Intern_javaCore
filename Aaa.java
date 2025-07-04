package pc1;

public class Aaa extends A {
	public static void main(String[]args) {
		A a = new A();
		System.out.println("Form c class differnt package: ");
		System.out.println("a= "+a.a);
		//protected can be accessed via inheritance
		Aaa c = new Aaa();
		System.out.println("c= "+c.c);
	}

}
