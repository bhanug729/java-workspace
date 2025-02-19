package Challenge001_050;

import java.util.Scanner;

class $26_RightShift {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to showcase RightShift Operator\n");

		System.out.print("Please enter your number: ");
		int num = input.nextInt();

		int result = num >> 1;
		System.out.println("Your result is: " + result);
	}
}
