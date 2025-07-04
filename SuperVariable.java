package core_java;

class animal{
	String color;
	animal(){
		System.out.println("animal constructor called");
	}
}

class Hourse extends animal{
	Hourse(){
		super();
		System.out.println(super.color = "brown");
		System.out.println("hourse constructor called");
	}
}

public class SuperVariable {
	public static void main(String[]args) {
		Hourse s = new Hourse();

	}
}
