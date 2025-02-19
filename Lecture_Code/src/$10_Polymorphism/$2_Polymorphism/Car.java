package $10_Polymorphism.$2_Polymorphism;

class Car extends Vehicle {

	Car(String brand) {
		super(brand);
	}
	
	public void sound() {
		System.out.println("Brooomm");
	}

	// Method overriding
	@Override
	public void start() {
		super.service();
		System.out.println("Car is starting...");
	}
}
