package core_java;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t = new TreeMap<>();
		t.put(1, "Pranav");
		t.put(2, "OM");
		t.put(3, "Ram");
		System.out.println(t);
		System.out.println(t.remove(3));
		System.out.println(t.remove(2, "OM"));
		System.out.println(t.isEmpty());
		System.out.println(t.replace(1, "Pranav","pqr"));
		System.out.println(t);
	}

}
