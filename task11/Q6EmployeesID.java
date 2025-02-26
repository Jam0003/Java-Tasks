package Task11;

import java.util.TreeMap;
import java.util.TreeSet;

public class Q6EmployeesID {


		  TreeMap<Integer, String> treemap = new TreeMap<>();

		    public void addValues() {
		        treemap.put(1, "Rajini");
		        treemap.put(2, "Vijay");
		        treemap.put(3, "Ajith");
		        treemap.put(4, "Surya");
		        treemap.put(5, "Simbu");

		    }

		    // by using the key we can also set values in alphabetical order
		    public void displayMap() {

		        // for(String mapelement: treemap.values()){
		        // System.out.println(mapelement);
		        // }

		        for (String mapelement : new TreeSet<String>(treemap.values())) {
		            System.out.println(mapelement);
		        }

		    }

		    public static void main(String[] args) {
		        Q6EmployeesID em = new Q6EmployeesID();
		        em.addValues();
		        em.displayMap();

		
	}

}
