//１．하나의　상자에　오렌지를　１０개씩　담을　수　있다．　오렌지가　１２７개　있다면　상자　몇
//개가　필요한가？　또　몇 개의　오렌지가　남을까？
public class Ex3 {

	public static void main(String[] args) {
		int totalOrangeNum = 127;
		int set = 10;
		
		System.out.println("필요한 상자 갯수 : " + totalOrangeNum/set);
		System.out.println("남은 오렌지 갯수 : " + totalOrangeNum%set);
		
		
	}

}
