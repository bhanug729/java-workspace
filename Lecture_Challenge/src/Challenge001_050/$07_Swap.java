package Challenge001_050;

import java.util.Scanner;

class $07_Swap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Swapping station\n");

		System.out.print("Enter value of A: ");
		int a = input.nextInt();
		System.out.print("Enter value of B: ");
		int b = input.nextInt();

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Swapping done...");
		System.out.println("Value of A is:" + a);
		System.out.println("Value of B is:" + b);
	}
}
