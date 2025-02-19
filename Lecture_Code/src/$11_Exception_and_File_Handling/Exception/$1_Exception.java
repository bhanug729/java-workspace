package $11_Exception_and_File_Handling.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class $1_Exception {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[] {1,2,3,4,5};

		try {
			System.out.print("Enter index: ");
			int index = input.nextInt();
			System.out.print("Enter num: ");
			int a = input.nextInt();

			int div = arr[index] / a;
			System.out.println("Division: " + div);
		}
		
		// Do more specific to more general only
		// Unchecked Exceptions do not need to be explicitly handled
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.print("Bewkoof ");
			System.out.println(e.getMessage());
		
		} catch (InputMismatchException e) {
			System.out.println("Enter integer. " + e);
		
		} catch (Exception e) {
			System.out.println("Last Exception");
		}

	}
}
