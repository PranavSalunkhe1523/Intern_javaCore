package core_java;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(10);
		
		try {
		t.add("Platominds");
		}catch(ClassCastException e) {
			System.out.println(e);
		}
		
		System.out.println(t);
		
		TreeSet t2 = new TreeSet();

		t2.add(20);
		t2.add(22);
		t2.addAll(t);
		System.out.println(t2);
		
		System.out.println(t.size());
		System.out.println(t.remove(1));
		System.out.println(t2.contains(22));
		System.out.println(t.isEmpty());
		//System.out.println(t2.remove(t));
	}

}
