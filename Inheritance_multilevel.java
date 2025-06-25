package core_java;

class a{
		
		void m1() {
			System.out.println("1st class");
		}
	}
	
class b extends a{
		
		void m2() {
			System.out.println("2st class");
		}
	}
	
class c extends b{
		
		void m3() {
			System.out.println("3st class");
		}
	}
	
	
public class Inheritance_multilevel {
	public static void main(String[] args) {
		c s1 = new c();
		s1.m3();
		s1.m2();
		s1.m1();
	}

}
