package 문제풀이;

import java.util.Date;

public class 확인문제7 {

	public static void main(String[] args) {
		// Date - 시, 분, 초
		
		Date d1 = new Date();
		int today = d1.getDay();
		
		if (today==0) {
			System.out.println("쉬어요");
		}else if (today==6) {
			System.out.println("쉬어요"); 
		}else {
			System.out.println("달려요");
				
	}

}
}
