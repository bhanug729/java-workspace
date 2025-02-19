package $11_Exception_and_File_Handling.Exception;

import java.util.Scanner;

public class $2_Exception {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		b();
	}

	static void b() {
		c();
	}

	static void c() {
		d();
	}

	static void d() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		printName(name);
	}

	// throws is used to exception declaration
	// throws is followed by single/multiple exception class name
	static void printName(String name) throws IllegalArgumentException {
		if (name.contains("-")) {
			// throw is followed by only an instance of exception.
			throw new IllegalArgumentException();
		}
		System.out.println("Your name is " + name);
	}
}
