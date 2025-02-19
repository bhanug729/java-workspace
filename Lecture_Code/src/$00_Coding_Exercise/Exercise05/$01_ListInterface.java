package $00_Coding_Exercise.Exercise05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $01_ListInterface {

	public static void main(String[] args) {
		// Without specifying type we can store any type of variable 
		List list1 = new ArrayList();
		list1.add("Bhanu");
		list1.add(12.34);
		list1.add(false);
		list1.add(null);
		list1.add(2, 100);
		System.out.println(list1.toString() + "\n");

		// Type specific
		List<String> list = new ArrayList<>();
		list.add("Bhanu");
		list.add("Gupta");
		list.add(1,"Pratap");
		list.add("Happy");
		list.add("Gupta");
		System.out.println(list.contains("Gupta"));
		System.out.println(list.removeFirst());
		System.out.println(list.toString());
		System.out.println(list.remove("Gupta"));
		System.out.println(list.toString() + "\n");
		
		
		// Arrays.asList(...) - returns a fixed-size list backed by the specified array.
		// Arrays is fix in size so that list size cannot update. 
		// Operations not supported who changes the size (add,remove)
		Integer[] a = {1,2,4,3,4,5};
		List<Integer> li = Arrays.asList(a);
		
		li.set(0, 100);
		System.out.println(li.toString());
		System.out.println(Arrays.toString(a)); // Update in array "a" as well
		
		System.out.println(li.getLast());
		System.out.println(li.indexOf(4));
		System.out.println(li.contains(2));
		System.out.println(li.isEmpty());
		System.out.println(li.reversed());
		
		
		
	}
}
