package exercise;

public class Ex9 {

	public static void main(String[] args) {
		
		int randNum = (int)(Math.random()*10+1);
		System.out.println(randNum);
		
		System.out.println("주사위 번호 뽑기 :" + (int)(Math.random()*6+1));
		System.out.println("로또 번호 뽑기 : " + (int)(Math.random()*45+1));
	}

}
