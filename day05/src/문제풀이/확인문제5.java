package ����Ǯ��;

import java.util.Date;

public class Ȯ�ι���5 {

	public static void main(String[] args) {
		// Date - ��, ��, ��
		
		Date d1 = new Date();
		int hour = d1.getHours();
		int min = d1.getMinutes();
		int sec = d1.getSeconds();
		
		int year = d1.getYear() + 1900;
		int month = d1.getMonth() + 1;
		int today = d1.getDate();
		
		System.out.println(year + "�� " + month + "�� " + today + "��");
		
		int day = d1.getDay();
		if (day==0) {
			System.out.println("�Ͽ���");
		}else if (day==1) {
			System.out.println("������");
		}else if (day==2) {
			System.out.println("ȭ����");
		}else if (day==3) {
			System.out.println("������");
		}else if (day==4) {
			System.out.println("�����");
		}else if (day==5) {
			System.out.println("�ݿ���");
		
		}else if (day==6) {
			System.out.println("�����");
	}

}
}
