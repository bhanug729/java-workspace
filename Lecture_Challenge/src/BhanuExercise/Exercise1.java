package BhanuExercise;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println(Math.round(0.49));
		System.out.println(Math.round(0.50));
		System.out.println(Math.round(0.51));
		// round() returns the highest of the two nearest integers (O/P--> int)
		System.out.println();
		// rint() returns the nearest integer and for .5 nearest even integer. (O/P-->
		// double)
		System.out.println(Math.rint(0.49));
		System.out.println(Math.rint(0.50));
		System.out.println(Math.rint(1.50));
		System.out.println(Math.rint(1.51));
		System.out.println();
		System.out.println(Math.rint(5));
		System.out.println(Math.rint(5.1));
		System.out.println(Math.rint(-5.1));
		System.out.println(Math.rint(-5.9));
	}

}
