package $07_Encapsulation.$01_Package_and_AccessModifier;

public class $02_Car {
	public String color;
	public String model;
	private double fuelLevel;
	long costOfPurchase;

	public $02_Car() {
	}

	public $02_Car(String color, String model, double fuelLevel, long costOfPurchase) {
		this.color = color;
		this.model = model;
		this.fuelLevel = fuelLevel;
		this.costOfPurchase = costOfPurchase;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Car{");
		sb.append("color='").append(color).append('\'');
		sb.append(", model='").append(model).append('\'');
		sb.append(", fuelLevel=").append(fuelLevel);
		sb.append(", costOfPurchase=").append(costOfPurchase);
		sb.append('}');
		return sb.toString();
	}
}
