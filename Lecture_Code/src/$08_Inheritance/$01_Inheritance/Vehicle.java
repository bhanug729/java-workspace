package $08_Inheritance.$01_Inheritance;

public class Vehicle {
	int numberOfTires;

	protected void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}
	
	public void commute() {
		System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
	}

	@Override
	public String toString() {
		return "Vehicle no of tires: " + numberOfTires;
	}
}
