package $00_Coding_Exercise;

public class Exercise00 {

	public static void main(String[] args) {
		System.out.println("Welcome to Coding World\n");

		forLoop(5);
		System.out.println();
		forLoop(15);
		System.out.println("\n");

		sumOfOdd(10);
		System.out.println();

		factorial(5);
		factorial(1);
		factorial(1);
		System.out.println();

		sumOfDigit(1234567);
		System.out.println();

		min(2, 12);
		min(22, 0);
		min(12, 12);
		System.out.println();

		System.out.println(lcm(4, 5));
		System.out.println(lcm(15, 10));
		System.out.println(lcm(10, 10));
		System.out.println();

		gcd(15, 15);
		gcd(3, 4);
		gcd(1000, 100);
		gcd(20, 12);
		System.out.println();

		System.out.println(reverseDigit(1234));
		System.out.println(reverseDigit(5));
		System.out.println(reverseDigit(250));
		System.out.println();

		System.out.println(numberOfDigit(1234));
		System.out.println(numberOfDigit(32));
		System.out.println();

		fibonacci(0);
		fibonacci(1);
		fibonacci(100);
		System.out.println();

		armstrong(2);
		armstrong(153);
		armstrong(371);
		armstrong(123);
		System.out.println();

		palindrome(4);
		palindrome(22);
		palindrome(202);
		palindrome(12321);
		palindrome(123);
	}

	public static void palindrome(int num) {
		int reverseNum = reverseDigit(num);

		if (num == reverseNum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static void armstrong(int num) {
		int sum = 0, numCopy = num;
		int occ = numberOfDigit(num);

		while (num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			sum += Math.pow(lastDigit, occ);
		}

		if (numCopy == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

	public static int numberOfDigit(int num) {
		int occ = 0;
		while (num > 0) {
			num /= 10;
			occ++;
		}
		return occ;
	}

	public static void fibonacci(int num) {
		if (num < 0) {
			return;
		}
		System.out.print("0 ");
		if (num == 0) {
			System.out.println();
			return;
		}
		System.out.print("1 ");

		int first = 0, sec = 1;
		while (first + sec <= num) {
			int temp = first + sec;
			first = sec;
			sec = temp;
			System.out.print(temp + " ");
		}
		System.out.println();
	}

	public static int reverseDigit(int num) {
		int newNum = 0;
		while (num > 0) {
			int digit = num % 10;
			num /= 10;
			newNum = 10 * newNum + digit;
		}
		return newNum;
	}

	public static void gcd(int num1, int num2) {
		int minValue = (num1 < num2) ? num1 : num2;
		int i = 2, gcd = 1;

		while (i <= minValue) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				gcd = i;
			}
			i++;
		}
		System.out.println(gcd);
	}

	public static int lcm(int num1, int num2) {
		int i = 1;
		while (true) {
			int factor = num1 * i;
			if (factor % num2 == 0) {
				return factor;
			}
			i++;
		}
	}

	public static void min(int num1, int num2) {
		int min;
		if (num1 <= num2) {
			min = num1;
		} else {
			min = num2;
		}
		System.out.println(min);
	}

	public static void sumOfDigit(int num) {
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		System.out.println(sum);
	}

	public static void factorial(int num) {
		int i = 1, fact = 1;
		while (i <= num) {
			fact *= i;
			i++;
		}
		System.out.println(fact);
	}

	public static void sumOfOdd(int num) {
		int i = 0, sum = 0;
		while (i <= num) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}

	public static void forLoop(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.print(i + " ");
			if (i >= 10) {
				return;
			}
		}
	}
}

