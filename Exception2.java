package core_java;

public class Exception2 {
	public static void main(String[]args) {
		String s = null;
		
		try {
		System.out.println(s.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
		}
	}
}
