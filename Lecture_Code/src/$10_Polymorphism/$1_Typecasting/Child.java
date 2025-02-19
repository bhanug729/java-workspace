package $10_Polymorphism.$1_Typecasting;

public class Child extends Parent {

	int id;

	void newMethod() {
		System.out.println("New Method from Child");
	}

	@Override
	void method() {
		System.out.println("Override Method from Child");
	}
}
