package exercise;
//２．　마일을　킬로미터로　변환하는　프로그램을　작성하시오．
//입력을　받아서　변환함．　ｎｅｘｔＤｏｕｂｌｅ（）　이용

import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {

		//1mile -> 1.60934km
		double userInputMile;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마일을 입력하세요 : ");
		userInputMile = sc.nextDouble();
		
		System.out.println(userInputMile*1.60934+"km 입니다.");
		sc.close();
	}

}
