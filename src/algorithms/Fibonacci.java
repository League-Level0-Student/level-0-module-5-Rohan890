package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i < 12; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
