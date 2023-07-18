package exercise;

public class Ex11 {

	public static void main(String[] args) {
		int a, b, c;
		a = (int) (Math.random() * 100 + 1);
		b = (int) (Math.random() * 100 + 1);
		c = (int) (Math.random() * 100 + 1);
		int max;

		if (a >= b) {
			if (a > c)
				max = a;
			else
				max = c;

		} else {
			if (b <= c)
				max = c;
			else
				max = b;
		}

		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		System.out.println("max = " + max);

	}

}
