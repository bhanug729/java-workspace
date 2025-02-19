package $12_Collections_and_Generics.enums;

public enum TrafficLight {
	RED("Stop"), GREEN("Go"), YELLOW("Caution");

	private final String action;

	TrafficLight(String action) {
		this.action = action;
	}
}
