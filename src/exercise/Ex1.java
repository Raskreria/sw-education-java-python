package exercise;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String age, weight, height;
		System.out.println("나이를 입력하세요");
		age = sc.nextLine();
		System.out.println("체중를 입력하세요");
		weight = sc.nextLine();
		System.out.println("키를 입력하세요");
		height = sc.nextLine();
		
		System.out.println("나이 : " + age +" 체중 : " + weight +"키 : "+ height);
		
		
		sc.close();
	}

}
