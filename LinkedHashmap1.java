package core_java;

import java.util.LinkedHashMap;

public class LinkedHashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer,String> l = new LinkedHashMap<>();
		l.put(1, "abc");
		l.put(2, "xya");
		l.put(3, "pqr");
		System.out.println(l);
		System.out.println(l.remove(3));
		System.out.println(l.remove(2, "xyz"));
		System.out.println(l.replace(1, "abc","pqr"));
		System.out.println(l.isEmpty());
		}

	}

