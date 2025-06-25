package core_java;
import java.util.*;

public class While_loop_Even {
	public static void main(String[]args) {
		//Even Number
		int n = 1;
		while(n <= 10) {
			if(n % 2 == 0) {
				System.out.println("Even number : "+n);
			}
			n++;
		}
		System.out.println();
		
		//Odd numbers
		int i = 1;
		while(i < 10) {
			System.out.println("Odd number : "+i);
			i+=2;
			}
		
		
		//Reverse number
		int j = 10;
		while(j >= 1) {
			System.out.println("Reverse numbers: "+j);
			j--;
		}
		
		//Table 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int a = 1;
		while(a <= 10) {
			System.out.println("table : "+(num * a));
			a++;
		}
	}

}
