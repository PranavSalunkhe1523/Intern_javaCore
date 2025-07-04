package core_java;
import java.util.ArrayList;

public class MaxArraylistElement {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(2);
		a.add(9);
		a.add(6);
		a.add(8);
		a.add(3);
		
		System.out.println(a);
		
		 int max =a.get(0);
		 
		 for(int i = 0; i<a.size();i++) {
			if(max < a.get(i)) {
				max = a.get(i);
			}
			
		 }
		 System.out.println("Max Element of ArrayList: "+max);

	}

}
