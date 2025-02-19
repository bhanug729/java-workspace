package $04_While_loop_Methods_Arrays;

public class $9_Bike {
	String color;
	float price;

	static {
		System.out.println("This is a Static Block");
	}

	{
		System.out.println("This is a Initialization Block");
		color = "Black";
		price = 50000;
	}

	$9_Bike(String bikeColor, float bikePrice) {
		color = bikeColor;
		price = bikePrice;
	}

	$9_Bike() { // Default constructor
		color = "Black";
		price = 50000;
	}

	public static void main(String[] args) {
		$9_Bike yamaha = new $9_Bike();

		if (true) { // code block
			System.out.println("Code Block");
		}
	}
}
