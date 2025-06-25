package core_java;

public class MethodOverrding extends Method_Overrading  {
	void start() {
		System.out.println("Bike is started");
	}
	
	public static void main(String[]args) {
		MethodOverrding s1 = new MethodOverrding();
		s1.start();
	}

}
