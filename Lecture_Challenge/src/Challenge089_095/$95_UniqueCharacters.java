package Challenge089_095;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class $95_UniqueCharacters {
	public static void main(String[] args) {
		Set<Character> unique = new HashSet<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your string: ");
		String userStr = input.next();

		for (char ch : userStr.toCharArray()) {
			unique.add(ch);
		}

		System.out.printf("Your string has %d unique characters", unique.size());
	}
}
