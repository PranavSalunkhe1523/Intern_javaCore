package core_java;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> s1 = new HashMap<>();
		
		s1.put(1, "abc");
		s1.put(2, "xya");
		s1.put(3, "pqr");
		s1.put(null, null);
		System.out.println(s1);
		
		HashMap <Integer,String> s2 = new HashMap<>();
		s2.put(1,"ram ");
		s2.putAll(s1);
		System.out.println(s2);
		System.out.println(s2.equals(s1));
	}

}
