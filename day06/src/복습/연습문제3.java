package ����;

import java.util.Date;

public class ��������3 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		int day = d1.getMonth() + 1;

		switch (day) {
		case 2:
			System.out.println("28��");
			break;
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;
		default:
			System.out.println("30��");
			break;
		}
		
	}

}
