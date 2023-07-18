package exercise;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] splitStrs;

		do {
			System.out.print("주민번호를 입력하세요 : ");
			str = sc.nextLine();
			splitStrs = str.split("-");
			
			switch (splitStrs[1].charAt(0)) {
			case '1', '3' -> System.out.println("남자입니다.");
			case '2', '4' -> System.out.println("여자입니다");
			default -> System.out.println("입력오류입니다.");
			}
			
			System.out.print("입력을 계속하시겠습니까? (y/n) : ");
			str = sc.nextLine();
		} while (str.equals("y")||str.equals("Y"));

	}

}
