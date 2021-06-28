package 문제풀이;

import java.util.Date;

public class 확인문제8 {

	public static void main(String[] args) {
		// Date - 시, 분, 초

		Date d1 = new Date();
		int month = d1.getMonth() + 1;

		switch (month) {
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
