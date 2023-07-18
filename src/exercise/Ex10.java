package exercise;

public class Ex10 {

	public static void main(String[] args) {
		
		
		System.out.println("P\tQ\tAND\tOR\tXOR");
		printOper(true, true);
		printOper(true, false);
		printOper(false, true);
		printOper(false, false);
		
	}
	static void printOper(boolean p , boolean q) {
		System.out.println(p+"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q));
	}

}
