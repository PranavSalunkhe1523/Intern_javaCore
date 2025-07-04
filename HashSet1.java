package core_java;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(10);
		h.add("Platominds");
		System.out.println(h);
		
		HashSet h2 = new HashSet();

		h2.add(20);
		h2.add(22);
		h2.addAll(h);
		System.out.println(h2);
		
		System.out.println(h.size());
		System.out.println(h.remove(1));
		System.out.println(h2.contains(22));
		System.out.println(h.isEmpty());
		System.out.println(h2.remove(h));

	}

}
