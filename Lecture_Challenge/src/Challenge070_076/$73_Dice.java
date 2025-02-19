package Challenge070_076;

class $73_Dice {

	public static void main(String[] args) {
		$73_Dice dice = new $73_Dice();
		for (int i = 0; i < 25; i++) {
			System.out.print(dice.roll() + " ");
		}
	}

	int roll() {
		double random = Math.random() * 6;
		return (int) Math.ceil(random);
	}
}
