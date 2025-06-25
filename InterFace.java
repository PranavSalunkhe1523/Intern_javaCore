package core_java;

interface Client1 {
	
	public abstract void webdesign();
}

interface Client2{
	void webdevelopement();
}



public class InterFace implements Client1,Client2{
	@Override
	public void webdevelopement() {
		System.out.println("Design a web");
		
	}

	@Override
	public void webdesign() {
		System.out.println("develop a web");
		
	}
	
	public static void main(String[]args) {
		InterFace s = new InterFace();
		s.webdevelopement();
		s.webdesign();
	}

}
