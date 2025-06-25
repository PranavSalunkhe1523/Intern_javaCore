package core_java;
import java.util.*;
public class Person {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int Age = sc. nextInt();
		
		if (Age > 18 ) {
			System.out.println("Person can Vote");
		}
		else {
			System.out.println("Person is adult can not Vote");
		}
		System.out.println();
		
		System.out.println("Enter the student mark: ");
		float mark = sc.nextFloat();
		
		if (mark > 90) {
			System.out.println("1st Rank");
		}
		else if(mark >= 70 && mark <= 90) {
			System.out.println("2nd Rank");
		}
		else if(mark >= 40 && mark < 70) {
			System.out.println("3nd Rank");
		}
		else {
			System.out.println("fail");
		}
		
		
	}

}
