package $06_Control_Statements_Math_String;

public class $13_TestingFinal {

	final int x = 123;

	void testing() {
		//x = 100;      Error here.
		System.out.println(x);
	}

	public static void main(String[] args) {
		$13_TestingFinal tf = new $13_TestingFinal();
		tf.testing();
	}
}
