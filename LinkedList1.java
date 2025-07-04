package core_java;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(6);
		l.add(8);
		l.add("Platominds");
		System.out.println(l);
		
		LinkedList l2 = new LinkedList();

		l2.add(20);
		l2.add(22);
		l2.addAll(l);
		System.out.println(l2);
		
		System.out.println(l.size());
		System.out.println(l.remove(1));
		System.out.println(l2.contains(22));
		System.out.println(l.isEmpty());
		System.out.println(l2.remove(l));

	}

}
