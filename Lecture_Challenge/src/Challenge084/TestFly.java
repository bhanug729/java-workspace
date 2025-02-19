package Challenge084;

public class TestFly {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.eat();
		eagle.getBreed();
		eagle.color();
		FlyableInterface.legs();
	}
}