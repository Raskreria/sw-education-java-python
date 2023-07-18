package exercise;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int cntA=0, cntB=0;
		
		for(int i = 0; i< str.length() ; i++) {
			switch(str.charAt(i)) {
			case 'A','E','O','U','I','a','e','o','u','i' -> cntA++;
			default -> cntB++;
			}	
		}
		System.out.println("입력한 문자의 모음 갯수 :" + cntA);
		System.out.println("입력한 문자의 자음 갯수 :" + cntB);
	}
}


