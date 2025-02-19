package Challenge084;

// Abstract Class can not be instantiated.
abstract class Bird implements FlyableInterface {

	private final String breed;

	// Parameterized constructor can only used by subclass
	public Bird(String breed) {
		this.breed = breed;
	}
	
	abstract void color();

	public String getBreed() {
		return breed;
	}
}
