package $07_Encapsulation.$03_GetterSetter;

public class BikeDetail {

	public static void main(String[] args) {
		
		Bike swift = new Bike("Red", "Dezire", 5, 3000);
		System.out.println(swift.color);
		System.out.println(swift.model);
		System.out.println(swift.costOfPurchase);
		System.out.println(swift.getFuelLevel()+"\n");
		
		swift.setColor("Yellow");
		System.out.println(swift.color);
	}

}
