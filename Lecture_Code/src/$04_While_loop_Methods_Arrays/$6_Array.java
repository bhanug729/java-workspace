package $04_While_loop_Methods_Arrays;

import java.util.Arrays;

public class $6_Array {
	public static void main(String[] args) {
//		  If element is not available to store.
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[3] = 65;
//        myArr[1] = 2;
//        myArr[2] = 8;
//        myArr[4] = 37;
		
		// If element is available to store.
		int[] myArr = { 98, 2, 2, 8, 65, 37 };
//        int index = 2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
		
		// Array Traversal
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		
		System.out.println(arr1.clone() + " " + arr1);   // x != x.clone() (new object)
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(Arrays.copyOf(arr1, 10)));
		System.out.println(Arrays.compare(arr1,arr2));
		System.out.println();
		
		// Array Traversal
		System.out.println(Arrays.toString(myArr)); // One Liner
		// or
		int index = 0;
		while (index < myArr.length) {
			System.out.println(myArr[index]);
			index++;
		}

		String[] strArr = new String[4];
		strArr[0] = "My String";

		String[] newStrArr = { "first", "second", "third" };
		System.out.println(newStrArr.length);
	}
}
