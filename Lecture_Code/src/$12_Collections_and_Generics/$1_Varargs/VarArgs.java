package $12_Collections_and_Generics.$1_Varargs;

public class VarArgs {
	public static void main(String... args) {
		System.out.println(sum(4, 5));
		System.out.println(sum(4, 5, 6));
		System.out.println(sum(4, 5, 6, 5, 3, 2));
		System.out.println(sum(1, 2, 5, 7, 8));
	}

	// Varargs: Declared using ellipsis(...) --> void method(int... nums)
	// Internally treated as arrays. int... nums == int[] nums
	// Must be the last in the method's parameters.
	// Usage: Call with varying argument counts,
	public static int sum(int first, int second, int... a) {
		int sum = first + second;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}