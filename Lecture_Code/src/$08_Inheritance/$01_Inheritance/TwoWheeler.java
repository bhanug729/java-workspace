package $08_Inheritance.$01_Inheritance;

public class TwoWheeler extends Vehicle {
	
	// Default constructor runs automatically for each new object.
	public TwoWheeler() {
		numberOfTires = 2;
	}

	public void balance() {
		System.out.println("I am balancing on " + numberOfTires + " tires");
	}
}
