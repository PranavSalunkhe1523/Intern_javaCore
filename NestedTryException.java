package core_java;

public class NestedTryException {
	public static void main(String[]args) {
		
		 String s = null;
		  
		  try {
			  System.out.println(s.length());
			  
			  int a[] = {10,20};
				try {
					System.out.println(a[2]);	
					}catch(ArrayIndexOutOfBoundsException e){
						System.out.println(e);
					}
				
		  		}catch(NullPointerException e){
				System.out.println(e);
			}
		}
	}

