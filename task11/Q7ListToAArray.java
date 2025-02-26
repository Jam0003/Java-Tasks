package Task11;

import java.util.ArrayList;

public class Q7ListToAArray {

	public static void main(String[] args) {
		
		 ArrayList<String> List = new ArrayList<>();

	        List.add("Rajini");
	        List.add("Vijay");
	        List.add("Ajith");
	        List.add("Surya");
	        
	        Object[] L = List.toArray();
	        
	        for (Object i : List.toArray())
	        {
	            System.err.print(i + " ");

	}

	}

}
