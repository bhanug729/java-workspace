package Challenge083;

// Abstract Class can not be instantiated.
public abstract class Shape {
	
	// Can have Parameterized/Default constructor (can only used by subclass)
	public Shape() {
		greetings();
	}
	
	public abstract double calculateArea();

	void greetings() {
		System.out.println("This is constructor from Shape Abstract class");
	}
}
