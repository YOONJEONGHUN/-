package ����Ǯ��;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) {

		String sn = "980201-1037514";

		char gender = sn.charAt(7);

		if (gender == '1' || gender == '3') {
			System.out.println("����� �����Դϴ�.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("����� �����Դϴ�.");
		} else
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
}
