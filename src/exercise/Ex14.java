package exercise;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("첫문자 소문자");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("첫문자 대문자");
		}
	}

}
