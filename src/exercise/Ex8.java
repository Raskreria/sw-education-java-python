package exercise;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("십진수를 입력하세요 : ");
		n = sc.nextInt();
		
	
		printBi(n);
		
	}
	
	static void printBi(int n) {
		if(n!=0){
			printBi(n/2);
			System.out.print(n%2);	
		}
		
	}

}
