package core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add("Pranav");
		l.add(20);
		System.out.println(l);
		
		ListIterator itr =  l.listIterator();
		itr.next();
		itr.next();
		itr.next();
		
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}

	}

}
