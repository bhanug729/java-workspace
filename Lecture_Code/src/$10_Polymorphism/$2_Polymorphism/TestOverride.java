// Method overriding
// Occurs when a subclass provides a new implementation for a method already defined in its superclass.

package $10_Polymorphism.$2_Polymorphism;

public class TestOverride {
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Plane p = new Plane();

		// here start() is override
		v.start();
		p.start();
		System.out.println();
		
	}
}
