package core_java;

public class Conditional_Statement {
      public static void main(String[]args) {
    	  int num = 1;
    	  // if statement
    	  if ( num > 0 ) {
    		  System.out.println("number is positive");
    	  }
    	  System.out.println("Thank You");
    	  
    	  //if-else Statement
    	  if (num < 0 ) {
    		  System.out.println("Positive");
    	  }
    	  else {
    		  System.out.println("Negitive");
    	  }
    	  
    	  //ladder statement
    	  if (num < 0 ) {
    		  System.out.println("Positive");
    	  }
    	  else if(num > 0) {
    		  System.out.println("Negitive");
    	  }
    	  else {
    		  System.out.println("number is Zero");
    	  }

      }
}
