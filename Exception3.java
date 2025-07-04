package core_java;

public class Exception3 {
	public static void main(String[]args) {
	
  String s = null;
  
  try {
	  System.out.println(s.length());
  }catch(NullPointerException e) {
	  System.out.println(e);
  }catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
}
}