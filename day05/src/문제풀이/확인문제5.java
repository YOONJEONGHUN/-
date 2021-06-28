package 문제풀이;

import java.util.Date;

public class 확인문제5 {

	public static void main(String[] args) {
		// Date - 시, 분, 초
		
		Date d1 = new Date();
		int hour = d1.getHours();
		int min = d1.getMinutes();
		int sec = d1.getSeconds();
		
		int year = d1.getYear() + 1900;
		int month = d1.getMonth() + 1;
		int today = d1.getDate();
		
		System.out.println(year + "년 " + month + "월 " + today + "일");
		
		int day = d1.getDay();
		if (day==0) {
			System.out.println("일요일");
		}else if (day==1) {
			System.out.println("월요일");
		}else if (day==2) {
			System.out.println("화요일");
		}else if (day==3) {
			System.out.println("수요일");
		}else if (day==4) {
			System.out.println("목요일");
		}else if (day==5) {
			System.out.println("금요일");
		
		}else if (day==6) {
			System.out.println("토요일");
	}

}
}
