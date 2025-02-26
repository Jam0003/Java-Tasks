package Task11;

import java.util.ArrayList;

public class Q5RemoveElementsArray {

	public static void main(String[] args) {

		ArrayList<String> List = new ArrayList<>();

		
		List.add("Happy");
		List.add("New");
		List.add("Year");
		List.add("2025");
		
		//Remove only one element using Remove
		List.remove("Happy");

		//By using clear we can remove all the elements directly

		List.clear();

		for (String element : List) {
		System.out.println(element);

			/* or
			 for (int i = 0; i < List.size(); i++) {
			 System.out.println(List.get(i));
			 */

		}
	}
}
