package $12_Collections_and_Generics.$3_Collection_Interface.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $2_List {
	
	public static void main(String[] args) {
		
		// Type specific
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1000);
		list.add(50);
		list.add(60);
		list.add(1000);
		list.add(70);
		System.out.println("Collection is: " + list.toString());
		System.out.println(list.contains(70));
		System.out.println(list.remove(4)); // 4 is index
		System.out.println(list.remove((Integer) 1000)); // Object pass
		System.out.println(list.removeFirst());
		System.out.println("Collection is: " + list.toString() + "\n");

		
		// Arrays and ArrayLists are different.
		// Arrays.asList(...) - returns a fixed-size list backed by the specified array.
		// While an arrays is fix in size that's why this list size cannot update.
		// Operations not supported who changes the size (add,remove..)
		Integer[] a = { 1, 2, 4, 3, 4, 5 };
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
