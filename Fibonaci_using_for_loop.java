package core_java;

public class Fibonaci_using_for_loop {

	public static void main(String[] args) {
		int n = 10;
		int Frist = 0;
		int Second = 1;
		System.out.print(Frist+" ");
		for(int i = 1; i <= n ; i++) {
			System.out.print(Second+" ");
			int next = Frist + Second;
			Frist = Second;
			Second = next;
			
			
		}

	}

}

