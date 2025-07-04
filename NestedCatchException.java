package core_java;

public class NestedCatchException {
	public static void main(String[]args) {
		
		 String s = null;
		  
		  try {
			  System.out.println(s.length());
		  		}
		  catch(NullPointerException e){
				System.out.println(e);
				
				 int a[] = {10,20};
					try {
						System.out.println(a[2]);	
						}catch(ArrayIndexOutOfBoundsException e1){
							System.out.println(e1);
						}
				}
		}
}