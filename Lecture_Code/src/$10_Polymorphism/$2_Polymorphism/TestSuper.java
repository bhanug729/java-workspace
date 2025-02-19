package $10_Polymorphism.$2_Polymorphism;

public class TestSuper {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car swift = new Car("Swift");

		v.start();
		System.out.println(v.getBrand());

		System.out.println();
		System.out.println(swift.getBrand());
		swift.start();
		swift.sound();
	}
}
