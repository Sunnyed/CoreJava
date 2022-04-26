package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		//Default clas in Java
		//dynamic array
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add("Testing");
	}

}
