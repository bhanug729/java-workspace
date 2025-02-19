package $06_Control_Statements_Math_String;

public class $05_ForEachLoop {
	public static void main(String[] args) {
		String[] array = new String[] { "Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta" };
        
		printArray(array);
        System.out.println();
		printArrayForEach(array);
	}

	public static void printArrayForEach(String[] array) {
		for (String name : array) {
			System.out.print(name + " ");
		}
	}

	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
