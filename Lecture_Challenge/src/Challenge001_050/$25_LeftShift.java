package Challenge001_050;

import java.util.Scanner;

class $25_LeftShift {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to showcase LeftShift Operator\n");

		System.out.print("Please enter your number: ");
		int num = input.nextInt();

		int result = num << 4;
		System.out.println("Your result is: " + result);
	}
}
