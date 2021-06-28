package 문제풀이;

import java.util.Date;

public class 확인문제6 {

	public static void main(String[] args) {
		// Date - 시, 분, 초
		
		Date d1 = new Date();
		int h1 = d1.getHours();
		
		if (h1<10) {
			System.out.println("굿모닝");
		}else if (h1<15) {
			System.out.println("좋은 오후입니다.");
		}else if (h1<20) {
			System.out.println("좋은 저녁입니다.");
		}else  {
			System.out.println("굿나잇");
		
	}

}
}
