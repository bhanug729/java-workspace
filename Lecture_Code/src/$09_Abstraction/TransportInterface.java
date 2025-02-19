// An interface specifies a contract for classes to implement by focusing on capabilities rather than implementation.
// An interface can’t be instantiated.
// All variables are implicitly declared as public, static and final (must be initialize).
// It cannot contain constructors.
// All methods are implicitly declared as public, abstract.
// Since Java 8,
	// Interfaces can include default methods with implementations.
	// Interfaces can include static methods, which belong to the interface itself rather than any instance.
// Since Java 9, interfaces can include private methods to encapsulate shared code between default methods, 
// helping to avoid code duplication within the interface.

package $09_Abstraction;

public interface TransportInterface {
	// Implicitly declared as public, static and final (must be initialize).
	String username = "Bhanu";

	// Implicitly declared as public, abstract.
	void getSetGo();

	default void defaultMethod() {
		System.out.println("Default Method in Interface");
	}

	static void staticMethod() {
		System.out.println("Static Method in Interface");
	}
}
