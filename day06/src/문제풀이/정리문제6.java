package ����Ǯ��;

import javax.swing.JOptionPane;

public class ��������6 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("�����ȣ�� �Է��ϼ���.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);

		switch (n2) {
		case '��':
			System.out.print("����� ��ȹ��_");
			break;
		case '��':
			System.out.print("����� �λ��_");
			break;
		case '��':
			System.out.print("����� ���ߺ�_");
			break;
		default:
			break;
		}
		switch (n3) {
		case '1':
		case '2':
			System.out.print("�ӿ��Դϴ�.");
			break;
		case '3':
			System.out.print("�����Դϴ�.");
			break;
		case '4':
		case '5':
			System.out.print("�����Դϴ�.");
			break;
		default:
			System.out.print("�ش����� �����ϴ�.");
			break;
		}
	}
}