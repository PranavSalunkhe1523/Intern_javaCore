package core_java;
import java.util.*;

public class Area {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		double Radius = sc.nextDouble();
		double Area = 3.14 * Radius * Radius;
		System.out.println("Circle area is : "+Area);
		System.out.println();
		
		int a = 4;
		int Squar = a * a;
		System.out.println("Area of squar: "+Squar);
		System.out.println();
		
		int l = 10;
		int b = 8;
		System.out.println("Area of Rectangle: "+(2*l*b));
		System.out.println();
		
		int h = 3;
		System.out.println("area of Tringle: "+(1/2 * b* h));
	}
}
