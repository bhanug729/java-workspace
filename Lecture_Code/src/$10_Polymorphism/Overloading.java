// Method/Constructor overloading
// Occurs when multiple methods in the same class have the same name but different parameter lists.
// Overloaded methods must differ in the number, type, or sequence of their parameters.
// Return Type can vary between overloaded methods, but the return type alone does not distinguish them.
// It's a form of Compile-Time Polymorphism that is resolved during compile time.

package $10_Polymorphism;

public class Overloading {

	Overloading() {
		System.out.println("Default constructor called.");
	}

	// Constructor overloading
	Overloading(String pop) {
		System.out.println("Hi," + pop);
	}

	// add method overloading here
	public int add(int a, int b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		Overloading overload = new Overloading("ABCD");
		System.out.println(overload.add(3, 4));
		System.out.println(overload.add(5, 6, 7, 8));
		System.out.println(overload.add("Bhanu", " Pratap"));
	}
}
