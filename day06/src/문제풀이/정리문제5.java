package ����Ǯ��;

import java.util.Date;

import javax.swing.JOptionPane;

public class ��������5 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		int n2 = Integer.parseInt(n1);
		Date year = new Date();
		int y1 = year.getYear() - n2 + 1900;
		System.out.println("����� �¾ ������ " + y1 + " �Դϴ�.");

		String t1 = JOptionPane.showInputDialog("����� �¾ �ð��� �Է��ϼ���");
		int t2 = Integer.parseInt(t1);
		Date hour = new Date();
		int t3 = hour.getHours();
		switch (t3) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("����� ������ �¾�̱���");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("����� ���Ŀ� �¾�̱���");
			break;
		case 21:
		case 22:
			System.out.println("����� ���� ���ῡ �¾�̱���");
			break;
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("����� ������ �¾�̱���");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}
}
