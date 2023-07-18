package exercise;

import java.util.Scanner;
//2. 부가세
public class Ex7 {

	public static void main(String[] args) {
		int totalPay;
		int price;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품의 가격을 입력하세요 : ");
		price = sc.nextInt();
		
		System.out.print("지불할 금액을 입력하세요 : ");
		totalPay = sc.nextInt();
		
		
		System.out.println("부가셰 : "+ totalPay*(0.1)+ "잔돈 : " + (price-totalPay));
		
		
	}

}
