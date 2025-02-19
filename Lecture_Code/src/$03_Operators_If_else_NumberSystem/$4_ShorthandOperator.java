package $03_Operators_If_else_NumberSystem;

import java.util.Scanner;

public class $4_ShorthandOperator {
	public static void main(String[] args) {
		System.out.print("Enter a number to increment by 1: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		a += 1; // a= a+1
		System.out.println(a);

		System.out.print("\nEnter new number to multiply by 10: ");
		int b = input.nextInt();
		b *= 10; // b= b*10
		System.out.println(b);
		
		System.out.print("\nEnter new number to devide by 5 and return remainder: ");
		int c = input.nextInt();
		c %= 10; // c= c%10
		System.out.println(c);
	}
}
