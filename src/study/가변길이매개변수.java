package study;

public class 가변길이매개변수 {

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 3, 4 };
		int result1 = sum(arr);

		System.out.println(result1);

		int result2 = sum(1, 2, 3, 4, 5);
		System.out.println(result2);

		System.out.println(sum(new int[] { 1, 2, 3 }));

	}

	static int sum(int... values) {
		int result = 0;

		for (int num : values) {
			result += num;
		}

		
		return result;
	}

}
