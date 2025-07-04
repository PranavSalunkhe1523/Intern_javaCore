package core_java;
import java.util.*;
public class Vector1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add("Platominds");
		System.out.println(v);
		
		Vector v2 = new Vector();

		v2.add(40);
		v2.add(50);
		v2.addAll(v);
		System.out.println(v2);
		
		System.out.println(v.size());
		System.out.println(v.remove(1));
		System.out.println(v.contains(10));
		System.out.println(v.isEmpty());
		System.out.println(v2.remove(v));

	}

}
