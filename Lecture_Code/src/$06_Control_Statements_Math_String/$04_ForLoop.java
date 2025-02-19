package $06_Control_Statements_Math_String;

public class $04_ForLoop {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 20) {
			System.out.print(i + " ");
			i+=2;
		}
		System.out.println();

		for (int j = 0; j < 20; j += 2) {
			System.out.print(j + " ");
		}
	}
}
