package core_java;

public class Static_block {
	static {
		System.out.println("Static Block");
	}
	
	 public static void main(String[]args) {
		 Static_block a = new Static_block();
		 System.out.println("this is main mothod");
	 }
	 
	 static {
		 System.out.println("2nd Static Block");
	 }
	 
	 {
		 System.out.println("Non-Static Block");
	 }
}
