package $08_Inheritance.$02_Inheritance_Test;

import $08_Inheritance.$01_Inheritance.TwoWheeler;

public class SpecialMotorCycle extends TwoWheeler {
	public double petrolCapacity;

	// Default constructor runs automatically for each new object.
	public SpecialMotorCycle() {
		// numberOfTires = 4;	   we can't use Default member in other package.
		setNumberOfTires(4);	// we can use Protected member in other package 
	}


	public void start() {
		System.out.println("Starting");
	}
}
