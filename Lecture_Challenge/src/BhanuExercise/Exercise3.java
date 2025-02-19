package BhanuExercise;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		Random random = new Random();

		// Generate random integer without upper bound
		System.out.println(" Random Integer: " + random.nextInt());

		// generate random integer with bound 100
		// generate random integer between 0 to 99
		System.out.println(" Random Integer: " + random.nextInt(100)); // [0, 100)
		System.out.println(" Random Integer: " + random.nextInt(80, 100)); // [80,100)

		// Generate random double with upper bound 100
		System.out.println(" Random Double : " + random.nextDouble(100));

		// Generate random float
		System.out.println(" Random Float  : " + random.nextFloat());

		// Generate random boolean
		System.out.println(" Random Boolean: " + random.nextBoolean());

	}
}