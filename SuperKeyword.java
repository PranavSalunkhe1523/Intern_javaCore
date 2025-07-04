package core_java;

class A1{
	int  a =10;
}
class A2 extends A1{
	int a = 20;
	
	void m1() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		A2 s = new A2();
		s.m1();
	}

}
