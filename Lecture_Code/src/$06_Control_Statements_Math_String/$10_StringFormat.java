package $06_Control_Statements_Math_String;

public class $10_StringFormat {
	public static void main(String[] args) {
		String name = "Sandeep";
		int marks = 45765;
		
		System.out.println("Hello " + name + ", your marks are: " + marks);
		System.out.printf("Hello %-10S, your marks are: %0,5d", name, marks);
	}
}
