package $00_Coding_Exercise;

import java.util.Arrays;

public class NewExercise {
	
	public static void main(String[] args) {
		leftHalfPyramid(5);
		System.out.println();
		rightHalfPyramid(5);

		System.out.println("\n");
		gcd(12,6);
		lcm(21,5);
		
		System.out.println("\n");
		reverse(new int[]{1,2,2,1});
		reverse(new int[]{1,2,3,4,5});
		
		System.out.println("\n");
		palindrome(new int[]{1,2,2,1});
		palindrome(new int[]{1,2,3,2,1});
		palindrome(new int[]{1});
		palindrome(new int[]{2,2});
		palindrome(new int[]{1,2,3,1});
		
		System.out.println("\n");
		delete(new int[]{1,2,3,2,1}, 1);
		delete(new int[]{1,2,3,2,1}, 2);
		delete(new int[]{1,2,3,2,1}, 3);
		delete(new int[]{1,1,1,1}, 1);
		
		System.out.println("\n");
		mergeSortedArray(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
		mergeSortedArray(new int[] { 4, 5, 6, 7 }, new int[] { 1, 2, 3, 8, 9, 10, 11 });
		mergeSortedArray(new int[] { 1, 2, 3, 8, 9, 10, 11 }, new int[] { 4, 5, 6, 7 });
	}
	
	
	
	public static void mergeSortedArray(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		
		int i=0, j=0, k=0;
		while (i<arr1.length || j<arr2.length) {
			
			if ((j==arr2.length) || (i<arr1.length && arr1[i] < arr2[j])) {
				newArr[k] = arr1[i];
				k++;
				i++;
			} else {
				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}
		System.out.println(Arrays.toString(newArr));	
	}
	
	public static void delete(int[] arr, int num) {
		int occ = occ(arr, num);
		int[] newArr = new int[arr.length-occ];
		
		int i = 0, j=0;
		while(i<arr.length) {
			if(arr[i] != num ) {
				newArr[j] = arr[i];
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(newArr) + newArr.length);
	}
	
	public static int occ(int[] arr, int num) {
		int occ = 0;
		int i=0;
		while(i<arr.length) {
			if (arr[i] == num ) {
				occ += 1;
			}
			i++;
		}
		return occ;
	}
	
	public static void palindrome(int[] arr) {
		int i = 0;
		while(i<arr.length/2) {
			if(arr[i] != arr[arr.length-1-i]) {
				System.out.println("Not Palidrome");
				return;
			}
			i++;
		}
		System.out.println("Palindrome");
	}
	
	public static void reverse(int[] arr) {
		int[] reverseArr = new int[arr.length];
		
		int i = arr.length-1;
		while(i >= 0) {
			reverseArr[i] = arr[arr.length-1-i];
			i--;
		}
		System.out.println(Arrays.toString(reverseArr));
	}
	
	public static void rightHalfPyramid(int num) {
		int i = num;
		while(i>0) {
			
			int j=i-1;
			while(j>0) {
				System.out.print("  ");
				j--;
			}
			
			int k=num+1-i;
			while(k>0) {
				System.out.print("* ");
				k--;
			}
			
			System.out.println();
			i--;
		}
		
	}
	
	public static void leftHalfPyramid(int num) {
		int i=1;
		
		while(i<=num) {
			int j=0;
			while (j<i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void lcm(int num1, int num2) {
		
		int i=1;
		while(true) {
			int factor = num1*i;
			if (factor%num2 == 0) {
				System.out.println("LCM: " + factor);
				break;
			}
			i++;
		}
		
	}
	
	public static void gcd(int num1, int num2) {
		int minValue = num1 < num2 ? num1 : num2;
		int i=2, gcd=1;
		
		while (i <= minValue) {
			if (num1%i==0 && num2%i==0) {
				gcd = i;
			}
			i++;
		}
		System.out.println("GCD: " + gcd);
	}
}
