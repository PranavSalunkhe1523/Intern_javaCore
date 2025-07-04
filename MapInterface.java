package core_java;
import java.util.*;

class A3{
	
	void m1() {
	HashMap <Integer,String> s = new HashMap<>();
	
	s.put(1, "abc");
	s.put(2, "xya");
	s.put(3, "pqr");
	System.out.println(s);
	System.out.println(s.remove(3));
	System.out.println(s.remove(2, "xyz"));
	System.out.println(s.isEmpty());
	System.out.println(s.replace(1, "abc","pqr"));
	}
	
}

public class MapInterface {
	public static void main(String[]args) {
	A3 a = new A3();
	a.m1();
	}

}
