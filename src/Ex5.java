//３．　사용자로부터　두 개의　정수를　받아서　합，　차，　곱，　평균，　큰 수，　작은 수를　계산하여　출력하는　프로그램을　작성하시오．
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("두개의 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("두 수의 합 : " + (num1+num2));
		System.out.println("두 수의 차 : "+ (num1-num2));
		System.out.println("두 수의 곱 : "+ (num1*num2));
		System.out.println("두 수의 평균 : "+ (num1+num2)/2.0);
		System.out.println("두 수의 큰 수 : " + (num1>num2?num1:num2));
		System.out.println("두 수의 작은 수 : "+ (num1>num2?num2:num1));
		sc.close();
	}

}
