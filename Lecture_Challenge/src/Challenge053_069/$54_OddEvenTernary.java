package Challenge053_069;

import java.util.Scanner;

class $54_OddEvenTernary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Odd or even\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		String result = num % 2 == 0 ? "Even" : "Odd";
		System.out.println("Your number is: " + result);
	}
}
