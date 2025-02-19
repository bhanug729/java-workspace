package $00_Coding_Exercise;

import java.util.LinkedList;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<>();
		
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");
		myList.add("e");
		myList.add("f");
		System.out.println(myList);
//		reverse(myList);
//		System.out.println(myList);
		
		int len = myList.size();
		
		List<String> List1 = myList.subList(len/2, len);
		List<String> List2 = myList.subList(0, len/2);
		
		for (int i=0; i<len/2; i++) {
			System.out.print(List1.get(i) + " ");
			System.out.print(List2.reversed().get(i) + " ");
		}
				
	}

	public static void reverse(List<String> list) {
		int len = list.size();
		for (int i=0; i<list.size()/2; i++) {
			String temp = list.get(i);
			
			list.set(i, list.get(len-1-i));
			list.set(len-1-i, temp);
		}
			
	}
}
