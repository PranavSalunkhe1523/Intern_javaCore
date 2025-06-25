package core_java;

abstract  class Programming {
	public abstract void developer();
	
	void m1() {
		System.out.println("normal Method");
	}
	
	Programming(){
		System.out.println("High level");
	}
}
class java extends Programming{
	public void  developer() {
		System.out.println("james");
	}
	
}

class python extends Programming{
	
	public void developer() {
		System.out.println("vohn");
	}
}

public class Program{
	public static void main(String[]args) {
		Programming p = new java();
		p.developer();
		p.m1();
		
		Programming r = new python();
		r.developer();
		r.m1();
	}
}
