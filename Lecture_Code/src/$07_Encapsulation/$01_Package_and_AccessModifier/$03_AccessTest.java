package $07_Encapsulation.$01_Package_and_AccessModifier;

public class $03_AccessTest {

	public static void main(String[] args) {
		$02_Car car = new $02_Car();
		car.color = "Red";
		car.model = "Swift";
		car.costOfPurchase = 7654;
		System.out.println(car);
		
		$02_Car newCar = new $02_Car("Black", "BMW", 1, 5000);
		System.out.println(newCar);

	}
}
