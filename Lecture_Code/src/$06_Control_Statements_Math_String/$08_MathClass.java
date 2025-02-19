package $06_Control_Statements_Math_String;

public class $08_MathClass {
	public static void main(String[] args) {
		System.out.println(Math.abs(-99));
		System.out.println(Math.ceil(5.01));
		System.out.println(Math.floor(5.99));
		System.out.println(Math.round(5.49));
		System.out.println(Math.round(5.50));
		System.out.println(Math.PI);
		System.out.println(Math.E);

		System.out.println("\nPrint Random Value in between 0 to 100");
		for (int i = 0; i <= 25; i++) {
			int random = (int) (Math.random() * 101);
			System.out.print(random + " ");
		}
	}
}
