package $00_Coding_Exercise;

public class Exercise01 {
	
	public static void main(String[] args) {
		int num = 7;//input.nextInt();
		
		rightHalfPyramid(num);
		System.out.println();
		reverseRightHalfPyramid(num);
		System.out.println();
		leftHalfPyramid(num);
	}
	
	public static void leftHalfPyramid(int num) {
		int numCopy = num;
		while (num>0) {
			int i=0;
			while (i<num-1) {
				System.out.print("  ");
				i++;
			}
			int j=num-1;
			while (j<numCopy) {
				System.out.print("* ");
				j++;
			}
			num--;
			System.out.println();
		}
	}

	public static void reverseRightHalfPyramid(int num) {
		while(num>0) {
			int i=0;
			while (i < num) {
				System.out.print("* ");
				i++;
			}
			num--;
			System.out.println();
		}
	}

	public static void rightHalfPyramid(int num) {
		int rows = 1;
		while (rows <= num) {
			int i = 0;
			while (i < rows) {
				System.out.print("* ");
				i++;
			}
			rows++;
			System.out.println();
		}
	}
}
