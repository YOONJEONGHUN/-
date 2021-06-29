package 복습;

import java.util.Date;

public class 연습문제3 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		int day = d1.getMonth() + 1;

		switch (day) {
		case 2:
			System.out.println("28일");
			break;
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		default:
			System.out.println("30일");
			break;
		}
		
	}

}
