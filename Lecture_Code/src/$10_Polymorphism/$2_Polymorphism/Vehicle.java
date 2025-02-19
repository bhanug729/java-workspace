package $10_Polymorphism.$2_Polymorphism;

public class Vehicle {

	private String brand;

	Vehicle() {
		this.brand = "Unknown";
	}

	Vehicle(String brand) {
		this.brand = brand;
	}
	
	String getBrand() {
		return this.brand;
	}
	
	void service() {
		System.out.println("Vehicle is getting serviced.");
	}

	void start() {
		System.out.println("Vehicle is starting...");
	}
	
}
