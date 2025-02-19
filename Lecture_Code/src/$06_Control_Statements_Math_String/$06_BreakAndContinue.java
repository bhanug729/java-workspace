package $06_Control_Statements_Math_String;

public class $06_BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("before loop");
		for (int i = 1; i < 20; i++) {
			if (i == 11) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\nOut of loop\n");
		
		System.out.println("before loop");
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("\nOut of loop");
	}
}
