package $08_Inheritance.$03_equals;

public class EqualsAndHashCodeTest {
	public static void main(String[] args) {
		Person person1 = new Person("Prashant", 31, "001");
		Person person2 = new Person("Prashant", 30, "001");
		Person person3 = new Person("Prashant", 30, "001");

		System.out.println(person1.equals(person2));
		System.out.println(person2.equals(person3));
		System.out.println(person3.equals(person1));
	}
}
