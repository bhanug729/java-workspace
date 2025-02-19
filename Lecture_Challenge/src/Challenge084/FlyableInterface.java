package Challenge084;

public interface FlyableInterface {
	void fly();
	
	// Can only call by FlyableInterface.legs()
	// Can't call by any object
	static void legs() {
		System.out.println("(Interface) Birds have 2 legs");
	}
	
	// Can call by any object but not by this interface
	default void eat() {
		System.out.println("(Interface) Birds eat bread");
	}
}
