package ����Ǯ��;

import java.util.Date;

public class Ȯ�ι���7 {

	public static void main(String[] args) {
		// Date - ��, ��, ��
		
		Date d1 = new Date();
		int today = d1.getDay();
		
		if (today==0) {
			System.out.println("�����");
		}else if (today==6) {
			System.out.println("�����"); 
		}else {
			System.out.println("�޷���");
				
	}

}
}
