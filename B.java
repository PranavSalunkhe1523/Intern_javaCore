package pc1;

public class B {
	public static void main(String[]args) {
		A aa = new A();
		System.out.println("Access from B: ");
		System.out.println("a= "+aa.a);
		//System.out.println("b= "+aa.b);
		System.out.println("c= "+aa.c);
		System.out.println("d= "+aa.d);
	}
}