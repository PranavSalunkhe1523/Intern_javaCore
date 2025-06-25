package core_java;

public class reverse_pattern_forLoop {
	public static void main(String[]args) {
		int n = 5;
		for(int i = 1;i <=n ; i++) {
			for (int j = 1; j <= n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
