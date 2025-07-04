package core_java;

class B {
	B(){
		this(10);
		System.out.println("Defult");
	}
	B(int a){
		System.out.println("Parameter constructor");
		System.out.println(a);
	}
}
public class ThisConstructor {

	public static void main(String[] args) {
		B s =new B();
		
	}

}
