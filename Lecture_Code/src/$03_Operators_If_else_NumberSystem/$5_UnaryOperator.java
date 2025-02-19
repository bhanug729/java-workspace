package $03_Operators_If_else_NumberSystem;

public class $5_UnaryOperator {
	public static void main(String[] args) {
		System.out.println("Toggle");
		int x = 5;
		int y = -x;
		int z = -y;
		System.out.println(z);

		System.out.println("\nIncrement by 1");
		int p = 5;
		System.out.println(p++);
		System.out.println(p);

		System.out.println(++p);
		System.out.println(p);

		System.out.println("Decrement by 1");
		int q = 10;
		System.out.println(--q);
		System.out.println(q);

		System.out.println(q--);
		System.out.println(q);
	}
}
