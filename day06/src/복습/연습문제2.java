package ����;

import java.util.Date;

public class ��������2 {

	public static void main(String[] args) {

		Date date = new Date();
		int d1 = date.getMonth() + 1;

		switch (d1) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;

		default:
			System.out.println("�ܿ�");
			break;
		}
	}

}
