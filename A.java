package pc1;

public class A {
	
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	
	void show() {
		System.out.println("Inside class A :");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
	}
	
	public static void main(String[]args) {
		A a = new A();
		a.show();
	}
}