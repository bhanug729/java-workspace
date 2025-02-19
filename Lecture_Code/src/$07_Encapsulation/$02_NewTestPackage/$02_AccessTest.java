package $07_Encapsulation.$02_NewTestPackage;

import $07_Encapsulation.$01_Package_and_AccessModifier.$02_Car;

public class $02_AccessTest {
	public static void main(String[] args) {
		$02_Car car = new $02_Car("Yellow", "Dezire", 5, 3000);
		
		System.out.println(car.color);
		// color is public
		car.color = "Black";
		System.out.println(car.color);
		
		// Can't access default/private variable
		// car.costOfPurchase = 8;
		// car.fuelLevel = 8;
	}
}
