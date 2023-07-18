package exercise;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";

		int score1 = 0;
		switch(grade) {
		
		case "A":
			score1 = 100;
			break;
		case "B":
			score1 = 100;
			break;
		default:
			score1 = 100;
		}
		
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100-20;
			yield result;
		}
		default -> 60;
		};
		
		System.out.println("score2: "+ score2);
		
	}

}
