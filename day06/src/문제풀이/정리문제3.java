package ����Ǯ��;

import javax.swing.JOptionPane;

public class ��������3 {

	public static void main(String[] args) {

		String sn = "980201-1037514";

		char gender = sn.charAt(7);

		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
	
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}
	}

}
