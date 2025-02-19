package Challenge001_050;

import java.util.Scanner;

class $30_Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Factorial");

		System.out.print("Please enter your number: ");
		int num = input.nextInt();

		long fact = factorial(num);
		System.out.println("Factorial is: " + fact);
	}

	public static long factorial(int num) {
		long fact = 1;
		int i = 1;
		while (i <= num) {
			fact *= i;
			i++;
		}
		return fact;
	}
}
