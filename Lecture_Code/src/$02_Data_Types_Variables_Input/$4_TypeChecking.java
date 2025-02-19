// Type Checking
package $02_Data_Types_Variables_Input;

public class $4_TypeChecking {
	public static void main(String[] args) {
		String name = "Agent";
		int age = 10;
		double hight = 5.6;
		
		System.out.println(((Object) name).getClass().getSimpleName());
		System.out.println(((Object) age).getClass().getSimpleName());
		System.out.println(((Object) hight).getClass().getSimpleName());
	}
}