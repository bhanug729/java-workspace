package Challenge084;

public class Eagle extends Bird {
	public Eagle() {
		super("Eagle");
	}

	@Override
	void color() {
		System.out.println("Eagle color is black");
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying.");
	}

}
