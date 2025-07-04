package core_java;

public class Exception1 {
	public static void main(String[]args) {
		int a[] = {10,20};
		try {
			System.out.println(a[2]);	
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
	}

}
