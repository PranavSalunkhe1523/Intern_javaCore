package core_java;

public class variable {
	
	    void m1(){
	        int A=20;
	        System.out.println("local variable value: "+A);
	    }

	    static int y=20;
	     public static void main(String[]args){
	        int x = 21;

	        variable v=new variable();
	        v.m1();
	        System.out.println("Instance variable value of x: "+x);
	        System.out.println("static variable value y: "+variable.y);
	    }
	}