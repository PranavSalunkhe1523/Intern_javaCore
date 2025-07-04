package core_java;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet a = new LinkedHashSet();
		
		a.add(10);
		a.add(10);
		a.add("Platominds");
		System.out.println(a);
		
		LinkedHashSet a2 = new LinkedHashSet();
		a2.add(40);
		a2.add(50);
		a2.addAll(a);
		System.out.println(a2);
		
		System.out.println(a.size());
		System.out.println(a.remove(1));
		System.out.println(a.contains(10));

	}

}
