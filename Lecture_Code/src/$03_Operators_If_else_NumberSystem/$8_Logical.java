// 50% discount for all Female
// 50% discount for Male less then 18
// 25% discount for Male greater than 60
// No discount for male in b/w 19-59

package $03_Operators_If_else_NumberSystem;

import java.util.Scanner;

public class $8_Logical {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Ticket Discount Calculator");
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		System.out.print("Are you a female? (true/false) ");
		boolean isFemale = input.nextBoolean();

		if (age <= 18 || isFemale) {
			System.out.println("You got 50% discount");
		} else if (age >= 60 && !isFemale) {
			System.out.println("You got 25% discount");
		} else {
			System.out.println("You got no discount");
		}
	}
}
