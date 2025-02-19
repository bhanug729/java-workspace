package $06_Control_Statements_Math_String;

public class $09_ToStringWithCar {
	int noOfWheels;
	int noOfDoors;
	int maxSpeed;
	String name;
	String modelNumber;
	String company;

	public $09_ToStringWithCar(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
		this.noOfWheels = noOfWheels;
		this.noOfDoors = noOfDoors;
		this.maxSpeed = maxSpeed;
		this.name = name;
		this.modelNumber = modelNumber;
		this.company = company;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Car{");
		sb.append("noOfWheels=").append(noOfWheels);
		sb.append(", noOfDoors=").append(noOfDoors);
		sb.append(", maxSpeed=").append(maxSpeed);
		sb.append(", name='").append(name).append('\'');
		sb.append(", modelNumber='").append(modelNumber).append('\'');
		sb.append(", company='").append(company).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public static void main(String[] args) {
		$09_ToStringWithCar swift = new $09_ToStringWithCar(4, 4, 120, "Swift", "SW876", "Maruti");
		System.out.println(swift);

	}
}
