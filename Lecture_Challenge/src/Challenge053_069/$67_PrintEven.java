package Challenge053_069;

class $67_PrintEven {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
