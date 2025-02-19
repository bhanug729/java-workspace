package $00_Coding_Exercise;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// numGuess();

		// Occurrences
		int[] arr = new int[] { 1, 1, 1, 1, 3, 5, 1, 4, 22, 1, 22, 4 };
		occ(arr, 1);

		// Fibonacci
		int terms = 10;
		for (int i = 0; i < terms; i++) {
			System.out.print(fib(i) + " ");
		}

		// Palindrome
		System.out.println("\n\n" + isPalindrome("NITIN"));
		System.out.println(isPalindrome("MAAM"));
		System.out.println(isPalindrome("ABCD"));
		System.out.println(isPalindrome("ABCBA") + "\n");

		for (int i = 0; i < 25; i++) {
			System.out.print(rollDice() + " ");
		}
	}

	static int rollDice() {
		double random = Math.random() * 6;
		return (int) Math.ceil(random);
	}

	static boolean isPalindrome(String str) {
		if (str.length() <= 1) {
			return true;
		}
		int last = str.length() - 1;
		if (str.charAt(0) != str.charAt(last)) {
			return false;
		}
		String newStr = str.substring(1, last);
		return isPalindrome(newStr);
	}

	static int fib(int term) {
		if (term == 0)
			return 0;
		if (term == 1)
			return 1;

		return fib(term - 1) + fib(term - 2);
	}

	static void occ(int[] arr, int num) {
		int counter = 0;

		for (int x : arr) {
			if (x == num)
				counter++;
		}
		System.out.println(num + " number founds " + counter + " times\n");
	}

	static void numGuess() {
		Scanner input = new Scanner(System.in);
		int guess, num = (int) (Math.random() * 11);

		do {
			System.out.print("Guess a num: ");
			guess = input.nextInt();
		} while (num != guess);

		System.out.println("You guessed it right. Game Over!");
	}

}
