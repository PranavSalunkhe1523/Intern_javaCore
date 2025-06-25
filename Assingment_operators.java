package core_java;

public class Assingment_operators {
	public static void main(String[]args) {
		
		int A = 100;
		int B = 20;
		
		//Arithmetic operators
		System.out.println("Sum of both: "+(A+B));
		System.out.println("Minus of both: "+(A-B));
		System.out.println("Multiplication of both: "+(A*B));
		System.out.println("Divison of both: "+(A/B));
		System.out.println("Modulo of both: "+(A%B));
		System.out.println();
		
		//Relational operators
		System.out.println("A and B are equal: "+(A==B));
		System.out.println("A and B are not equal: "+(A!=B));
		System.out.println("A is greater than B : "+(A > B));
		System.out.println("A is less than B : "+(A < B));
		System.out.println();
		
		//logical operators
		System.out.println("Logical AND: "+((A == B) && (A > B)));
		System.out.println("Logical OR: "+((A == B) || (A > B)));
		System.out.println("NOT Operator: "+!(A > B));
		System.out.println();
		
		//Assignment operators
		int a = 10;
		a += 10;
		System.out.println("Value of a : "+a);
		
		int b = 20;
		b -= 10;
		System.out.println("Value of a : "+b);
		
		int c = 10;
		c *= 10;
		System.out.println("Value of a : "+c);
		
		int d = 20;
		a /= 5;
		System.out.println("Value of a : "+d);
		System.out.println();
		
		//unary Operators
		System.out.println(++A);
		System.out.println(A++);
		System.out.println(--A);
		System.out.println(A--);
		System.out.println("value of A: "+A);
		System.out.println();
		
		//Bitwise operators
		int x = 10;
		int y = 20;
		
		System.out.println("Binary And :"+(x & y) );
		System.out.println("Binary OR :"+(x | y) );
		System.out.println("Binary XOR :"+(x ^ y) );
		System.out.println("Binary one's Complement :"+(~x));
		System.out.println("Binary Left Shift :"+(x << y) );
		System.out.println("Binary Right Shift :"+(x >> y) );
		
	}

}
