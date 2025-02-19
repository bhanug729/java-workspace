package $00_Coding_Exercise.Exercise04;

public abstract class Birds implements Flyable{
	
	abstract void name();
	
	@Override
	public void fly() {
		System.out.println("Can fly..");
	}
}
