package core_java;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add("Platominds");
		System.out.println(a);
		
		ArrayList a2 = new ArrayList();
		a2.add(40);
		a2.add(50);
		a2.addAll(a);
		System.out.println(a2);
		
		System.out.println(a.size());
		System.out.println(a.remove(1));
		System.out.println(a.contains(10));
	}

	

}
