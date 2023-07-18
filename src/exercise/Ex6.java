package exercise;

import java.util.Scanner;
//1. 번개까지의 거리
public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int second;
		System.out.print("시간 간격을 입력하시오(단위: 초) :");
		second = sc.nextInt();
		
		System.out.println("번개가 발생한 곳까지의 거리 : " + second *340);
		
	}

}
