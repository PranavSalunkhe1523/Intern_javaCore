package core_java;

public class finallyBlock {
	public static void main(String[]args) {
		String a = null;
		try {
			System.out.println(a.length());
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		// finally block execute before catch 
		finally{
			System.out.println("final block executed");
		}
		
	}

}
