package $09_Abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		// Vehicle veh = new Vehicle(2);
		Car car = new Car(4, 6);
		System.out.println("Tires: " + car.getNoOfTires() + " Doors: " + car.getNoOfDoors());
		car.makeStartSound();
		car.commute();

		System.out.println("\nAbstract class method calling ");
		car.finalFun();
		Vehicle.finalFun();
		Vehicle.staticFun();

		System.out.println("\nInterface method calling ");
		// staticMethod(in Interface) belongs to the interface itself only not with
		// object
		TransportInterface.staticMethod();
		// car.staticMethod();

		car.defaultMethod();
	}
}
