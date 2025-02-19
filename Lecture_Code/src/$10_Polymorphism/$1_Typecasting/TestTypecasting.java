package $10_Polymorphism.$1_Typecasting;

public class TestTypecasting {

	public static void main(String[] args) {
		// Up-casting will be done internally
		// Child class specified members is allowed (overridden methods, etc.) but not all members.
		// Parent class method is overridden method hence this will be executed.
		Parent p = new Child();
		p.name = "ABCD";
		System.out.println(p.name);
		p.simple();
		p.method();
		// p.id = 1; ---> not accessible
		
		
		// Down-casting Implicitly --> compile time error
		// Down-casting is not possible when parent class object is referred by parent class.
		// Because Type-casting is not possible for a parent class reference object to the child class.
//		Parent newP = new Parent();
//		Child c1 = (Child) newP;
		
		
		// Down-casting has to be done externally.
		// Down-casting is possible only when child class object is referred by parent class(myP).
		// Below myP is storing child class object, only that's why down-casting is possible. 
		Parent myP = new Child();
		Child c = (Child) myP;
		c.id = 001;
		c.name = "XYZ";
		System.out.println("\n"+c.name);
		System.out.println(c.id);
		c.method();
		
		
		// Example
		// Down-casting uses
		System.out.println("\nDowncast Uses...");
		Child ch = new Child();
		downcastTest(ch);
	}
	
	static void downcastTest(Parent par) {
		if (par instanceof Child) {
			Child c = (Child) par;			// --> Down-casting here
			c.id = 999;
			c.name = "Bhanu";
			System.out.println(c.name);
			System.out.println(c.id);
			c.method();
		}
	}
}
