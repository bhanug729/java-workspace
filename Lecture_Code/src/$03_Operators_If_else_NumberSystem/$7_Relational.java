package $03_Operators_If_else_NumberSystem;

import java.util.Scanner;

public class $7_Relational {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Driving License Portal");
		System.out.print("Please enter your age: ");
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to drive");
		} else {
			System.out.println("Beta cycle chalao");
		}
		
		System.out.print("Please enter your pin: ");
		int name = input.nextInt();

		if (name == 1234) {
			System.out.println("Welcome!! Bhanu Pratap Gupta");
		} else {
			System.out.println("Access Denied...");
		}
	}
}
