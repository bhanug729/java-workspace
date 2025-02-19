package $09_Abstraction;

public class Car extends Vehicle {
	
	private int noOfDoors;

	public Car(int noOfTires, int noOfDoors) {
		super(noOfTires);
		this.noOfDoors = noOfDoors;
		System.out.println("Constructor in Car Class");
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	@Override
	public void getSetGo() {
		System.out.println("going to place..");
	}

	@Override
	public void makeStartSound() {
		System.out.println("Vroommm.....");
	}
}
