package Challenge001_050;

import java.util.Scanner;

class $34_Prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Prime Number checker");

		System.out.print("Please enter your number: ");
		int num = input.nextInt();

		boolean isPrime = isPrime(num);
		if (isPrime) {
			System.out.println("Your number is Prime");
		} else {
			System.out.println("Your number is not prime");
		}
	}

	public static boolean isPrime(int num) {
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
