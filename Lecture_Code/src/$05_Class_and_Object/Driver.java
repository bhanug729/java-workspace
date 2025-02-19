package $05_Class_and_Object;

public class Driver {

	// Static/Class variables
	static int minAgeForDriving = 18;

	// Not-static/Instance/Reference variables
	String name;
	int age;
	String dateOfLicense;

	public boolean isAllowedToDrive() {
		return this.age >= minAgeForDriving;
	}

	public static void main(String[] args) {
		System.out.println("This is 1st line of main method.");
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        System.out.println("Total car sold: " + Car.noOfCarsSold);

		Car swift = new Car("Red");
        System.out.println("Total car sold: " + Car.noOfCarsSold);
		Car thar = new Car();
        System.out.println("Total car sold: " + Car.noOfCarsSold);
		thar = null;
		swift.addFuel(6);
		swift.start().drive();
		System.out.println(swift.color);

        Driver myDriver = new Driver();
        // here "age" is non-static so we must to create an object to access.
        myDriver.age = 20;
        System.out.println(myDriver.dateOfLicense);
        
        // here "minAgeForDriving" is static and will be same for every object and the class.
        // It isn't necessary to create an object to access static/class variable.
        // It's better to Call by class but not mandatory.
        System.out.println(Driver.minAgeForDriving);
        System.out.println(minAgeForDriving);
        System.out.println(myDriver.minAgeForDriving);
        
        // static/class variable will be update globally not only for an object.
        myDriver.minAgeForDriving = 20;
        System.out.println(Driver.minAgeForDriving);
        System.out.println(myDriver.minAgeForDriving);
        
	}
}
