package exercise;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double width, height;
		System.out.println("밑변을 입력하세요");
		width = sc.nextDouble();
		System.out.println("높이을 입력하세요");
		height = sc.nextDouble();
		
		System.out.println("삼각형의 넓이는 : " + width*height/2.0);
		sc.close();
	}

}
