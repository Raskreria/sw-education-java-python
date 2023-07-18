package exercise;

public class Ex13 {

	public static void main(String[] args) {
		int coin;
		
		for(int i = 0 ; i < 3 ; i ++) {
			coin = throwCoin();
			printCoin(coin);
		}
		
		
	}
	static int throwCoin() {
		
		return (int)(Math.random()*2);
	}
	static void printCoin(int coin) {
		if(coin==1)
			System.out.println("앞 ");
		else
			System.out.println("뒤 ");
	}
}
