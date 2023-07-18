package exercise;

public class Ex12 {

	public static void main(String[] args) {
		int coin1, coin2;
		int cnt=0;
		do {
			coin1 = throwCoin();
			coin2 = throwCoin();
			cnt++;
			
		}while(coin1==coin2 && coin1==1);
		
		System.out.println("던진 횟수 :" + cnt);
		
	}
	static int throwCoin() {
		
		return (int)(Math.random()*2);
	}
	static void printCoin(int coin) {
		if(coin==1)
			System.out.print("앞 ");
		else
			System.out.print("뒤 ");
		
	}

}
