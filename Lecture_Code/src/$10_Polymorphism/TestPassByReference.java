package $10_Polymorphism;

public class TestPassByReference {

	public static void main(String[] args) {
		Point pt = new Point(4, 8);
		System.out.println(pt);
		move(pt);
		System.out.println(pt);
	}

	public static void move(Point p) {
		p.x++;
		p.y++;
		System.out.println(p);
	}

	public static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "x = " + x + ", y = " + y;
		}
	}
}
