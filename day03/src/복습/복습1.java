package 복습;

public class 복습1 {

	public static void main(String[] args) {
		//오늘온도 26.2
		//어제온도 27.5
		//어제온도와 오늘온도가 동일한지 프린트
		//어제온도보다 오늘온도가 높은지 프린트
		
		double todayTemp = 26.2;
		double yesterTemp = 27.5;
		
		System.out.println("오늘의온도는" + todayTemp);
		System.out.println(todayTemp == yesterTemp);
		System.out.println(todayTemp > yesterTemp);
	}

}
