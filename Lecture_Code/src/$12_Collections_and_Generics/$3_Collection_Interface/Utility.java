package $12_Collections_and_Generics.$3_Collection_Interface;

import java.util.Collection;

public class Utility {
	
	// Don't use this method, using .toString() method is enough.
	public static <E> void print(Collection<E> collection) {
		System.out.print("Collection is: ");
		for (E coll : collection) {
			System.out.printf("%s ", coll);
		}
		System.out.println();
	}
}
