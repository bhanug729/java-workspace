package $08_Inheritance;

// Outer class can't be protected/private
public class $04_NestedCarClass {

	private int noOfDoors;

	public void repair() {
		Tire t = new Tire();
	}

	// Can be protected/private as well
	protected class Tire {
		private double width;
		private double pressure;
		private String material;

		public void inflate() {
			noOfDoors = 4;
		}
	}
	
}
