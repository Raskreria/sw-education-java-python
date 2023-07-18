package exercise;

public class BreakOutterExample {

	public static void main(String[] args) {
		
		outter : for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				System.out.println("i = "+ i + ", j = "+ j);
				if(j==9)
					break outter;
			}
			
		}

	}

}
