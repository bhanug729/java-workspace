package $11_Exception_and_File_Handling.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class $3_Exception {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			try {
				System.out.print("Enter value: ");
				int num = input.nextInt();
				int div = 4 / num;
				System.out.println("Division: " + div);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				// finally block runs always
			} finally {
				System.out.println("Nested finally run");
			}
		} catch (InputMismatchException e) {
			System.out.println("Input type mismatch found");
			// finally block runs always
			// Ideal for closing resources like files or database connections
		} finally {
			System.out.println("Outer finally run");
		}
	}

}
