package Challenge053_069;

import java.util.Scanner;

class $65_ExitOnExit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter your command: ");
			String command = input.next();
			if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		System.out.println("You have successfully exited.");
	}
}
