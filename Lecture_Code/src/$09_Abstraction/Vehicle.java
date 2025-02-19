// Abstract methods do not have a body and must belong only in an abstract class/Interface.
// Abstract Class can't be instantiated with new operator.
// Like all class, an abstract class can be public/default.
// Abstract Class can have parameterized and default constructor (always present).

// Abstract classes can have instance/static variables and abstract/implemented methods.
// Abstract classes can also have final methods (Can't be overridden).
// Similar to the interface an abstract class can call static method by abstract class name.

package $09_Abstraction;

public abstract class Vehicle implements TransportInterface {
	// instance variable
	private int noOfTires;

	public abstract void makeStartSound();

	// Parameterized constructor (only used by it's subclass)
	public Vehicle(int noOfTires) {
		this.noOfTires = noOfTires;
		System.out.println("Constructor in Abstract Class");
	}

	// Final method (Can't be overridden)
	static final void finalFun() {
		System.out.println("Final method in Abstract Class");
	}

	public void commute() {
		System.out.println("going.....");
	}

	// Static method
	static void staticFun() {
		System.out.println("Static method in Abstract Class");
	}

	public int getNoOfTires() {
		return noOfTires;
	}

	public void setNoOfTires(int noOfTires) {
		this.noOfTires = noOfTires;
	}

}
