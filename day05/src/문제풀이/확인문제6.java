package ����Ǯ��;

import java.util.Date;

public class Ȯ�ι���6 {

	public static void main(String[] args) {
		// Date - ��, ��, ��
		
		Date d1 = new Date();
		int h1 = d1.getHours();
		
		if (h1<10) {
			System.out.println("�¸��");
		}else if (h1<15) {
			System.out.println("���� �����Դϴ�.");
		}else if (h1<20) {
			System.out.println("���� �����Դϴ�.");
		}else  {
			System.out.println("�³���");
		
	}

}
}
