package $07_Encapsulation.$03_GetterSetter;

public class Bike {
	public String color; // public
	public String model; // public
	long costOfPurchase; // default
	private double fuelLevel; // private

	public Bike(String color, String model, double fuelLevel, long costOfPurchase) {
		this.color = color;
		this.model = model;
		this.fuelLevel = fuelLevel;
		this.costOfPurchase = costOfPurchase;
	}

	public String getFuelLevel() {
		return Double.toString(fuelLevel)+" lit";
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals("Yellow")) {
			System.out.println("Pagal hai kya");
		} else {
			this.color = color;
		}
	}

}
