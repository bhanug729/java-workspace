package $05_Class_and_Object;

public class Car {
	static int noOfCarsSold;
	int noOfWheels;
	String color;
	float maxSpeed;
	float currentFuelInLiters;
	int noOfSeats;

	// Run at 2nd after static block.
	// Initialization Blocks run automatically each time an instance is created.
	{
		noOfCarsSold++;
		System.out.println("I am in Init Block");
	}

	// Run at 1st.
	// Static Blocks run automatically only once when the class is loaded.
	static {
		noOfCarsSold = 0;
		System.out.println("I am in Static Block");
	}

	// Constructors run automatically at 3rd number after Initialization and static blocks.
	Car(String color) {
		System.out.println("Constructor call here");
		noOfWheels = 4;
		this.color = color;
		maxSpeed = 150;
		currentFuelInLiters = 2;
		noOfSeats = 5;
	}

	// Constructors run automatically at 3rd number after Initialization and static blocks.
	Car() {
		this("Black");
		currentFuelInLiters = 5;
	}

	public Car start() {
		int pop = 5;
		if (currentFuelInLiters == 0) {
			System.out.println(pop);
			System.out.println("Car is out if fuel, can not start");
		} else if (currentFuelInLiters < 5) {
			System.out.println("Car is in reserved mode, please refuel");
		} else {
			System.out.println("Car is started.. bruhhhh.....");
		}
		return this;
	}

	public void drive() {
		currentFuelInLiters--;
		System.out.println("Car is driving");
	}

	public void addFuel(float currentFuelInLiters) {
		this.currentFuelInLiters += currentFuelInLiters;
	}

	public float getCurrentFuelLevel() {
		return currentFuelInLiters;
	}

	@Override
	public String toString() {
		return "Car{" + "noOfWheels=" + noOfWheels + ", color='" + color + '\'' + ", maxSpeed=" + maxSpeed
				+ ", currentFuelInLiters=" + currentFuelInLiters + ", noOfSeats=" + noOfSeats + '}';
	}
}
