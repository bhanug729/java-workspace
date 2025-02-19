package $12_Collections_and_Generics.$3_Collection_Interface.Lists;

import java.util.ArrayList;
import java.util.List;

public class $1_ListWithoutSpecificType {
	
	public static void main(String[] args) {

		// Without specifying type we can store any type of variable
		List list1 = new ArrayList();
		list1.add("Bhanu");
		list1.add(12.34);
		list1.add(false);
		list1.add(null);
		list1.add(2, 100);
		System.out.println("Collection is: " + list1.toString() + "\n");
		
	}
}
