package Challenge053_069;

import java.util.Scanner;

class $53_MinimumTernary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to finding minimum\n");
		System.out.print("Please enter your first number: ");
		int num1 = input.nextInt();
		System.out.print("Now, Please enter your second number: ");
		int num2 = input.nextInt();
		$53_MinimumTernary ternary = new $53_MinimumTernary();
		int min = ternary.min(num1, num2);
		System.out.println("Minimum number is: " + min);
	}

	public int min(int num1, int num2) {
		return num1 < num2 ? num1 : num2;
//        if (num1 < num2) {
//            return num1;
//        } else {
//            return num2;
//        }
	}
}
