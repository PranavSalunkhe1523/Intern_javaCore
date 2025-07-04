package core_java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Cursor1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add("Pranav");
		l.add(20);
		System.out.println(l);
		
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println(l.remove(1));

	}

}
