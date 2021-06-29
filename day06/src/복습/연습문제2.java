package 복습;

import java.util.Date;

public class 연습문제2 {

	public static void main(String[] args) {

		Date date = new Date();
		int d1 = date.getMonth() + 1;

		switch (d1) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;

		default:
			System.out.println("겨울");
			break;
		}
	}

}
