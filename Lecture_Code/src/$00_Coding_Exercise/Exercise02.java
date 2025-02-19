package $00_Coding_Exercise;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
//		int[] arr = inputArray(5);
//		displayArray(arr);

		int[] arr = { 11, 99, 22, 22, 11, 33, 44, 22, 55 };
		System.out.println(occ(arr, 22));
		System.out.println(occ(arr, 11));
		System.out.println();

		displayArray(arr);
		displayArray(reverse(arr));
		System.out.println();

		displayArray(arr);
		displayArray(deleteElement(arr, 22));
		System.out.println();

		isPalingdrome(new int[] { 1, 2, 3, 2, 1 });
		isPalingdrome(new int[] { 1, 2, 3, 4, 5 });
		isPalingdrome(new int[] { 1, 1, 1 });
		isPalingdrome(new int[] { 1, 1 });
		isPalingdrome(new int[] { 1 });
		System.out.println();

		mergeSortedArray(new int[] { 1, 2, 3, 8, 9 }, new int[] { 4, 5, 6, 7 });
		mergeSortedArray(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
		System.out.println();

		searchIn2DArr(22, new int[][] { { 1, 3, 5 }, { 2, 4, 6 } });
		searchIn2DArr(2, new int[][] { { 1, 3, 5 }, { 2, 4, 6 } });
		System.out.println();

		sumOfDigonal(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		sumOfDigonal(new int[][] { { 1, 2 }, { 4, 5 } });
	}

	public static void sumOfDigonal(int[][] arr) {
		int sum = 0, leftDigonalSum = 0, rightDigonalSum = 0;		
		int sumTwice = arr[arr.length/2][arr.length/2];

		int i = 0;
		while (i < arr.length) {
			leftDigonalSum += arr[i][i];
			i++;
		}
		int j=0;
		while (j<arr.length) {
			int colom = (arr.length-1) - j;
			rightDigonalSum += arr[j][colom]; 
			j++;
		}
		
		sum = (arr.length%2 == 0) ? (leftDigonalSum + rightDigonalSum) :
									(leftDigonalSum + rightDigonalSum - sumTwice);
		System.out.println(sum);
	}

	public static void searchIn2DArr(int num, int[][] arr) {
		int i = 0;
		while (i < arr.length) {
			int j = 0;
			while (j < arr[i].length) {
				if (arr[i][j] == num) {
					System.out.println("Number found");
					return;
				}
				j++;
			}
			i++;
		}
		System.out.println("Number not found");
	}

	public static void mergeSortedArray(int[] arr1, int[] arr2) {
		displayArray(arr1);
		displayArray(arr2);
		int[] newArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length || j < arr2.length) {
			if ((j == arr2.length) || (i < arr1.length && arr1[i] < arr2[j])) {
				newArr[k] = arr1[i];
				i++;
				k++;
			} else {
				newArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		displayArray(newArr);
	}

	public static void isPalingdrome(int[] arr) {
		int i = 0;
		while (i < arr.length/2) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				System.out.println("Not Palindrome");
				return;
			}
			i++;
		}
		System.out.println("Palindrome");
	}

	public static int[] deleteElement(int[] arr, int num) {
		int occ = occ(arr, num);
		int[] newArr = new int[arr.length - occ];

		int i = 0, j = 0;
		while (i < arr.length) {
			if (num != arr[i]) {
				newArr[j] = arr[i];
				j++;
			}
			i++;
		}
		return newArr;
	}

	public static int[] reverse(int[] arr) {
		int[] reverseArr = new int[arr.length];

		int i = 0;
		while (i < arr.length) {
			reverseArr[i] = arr[arr.length - 1 - i];
			i++;
		}
		return reverseArr;
	}

	public static int occ(int arr[], int num) {
		int i = 0, count = 0;
		while (i < arr.length) {
			if (num == arr[i]) {
				count++;
			}
			i++;
		}
		return count;
	}

	public static void displayArray(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println();
	}

	public static int[] inputArray(int length) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[length];
		int i = 0;
		while (i < length) {
			int num = input.nextInt();
			arr[i] = num;
			i++;
		}
		input.close();
		return arr;
	}
}
