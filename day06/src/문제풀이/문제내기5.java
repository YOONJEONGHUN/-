package ����Ǯ��;

import javax.swing.JOptionPane;

public class ��������5 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("����� �˻��ȣ�� �Է��ϼ���.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);

		switch (n2) {
		case '1':
		case '2':
		case '3':
		case '4':
			System.out.print("����� 1���ǹ�_");
			break;
		case '5':
		case '6':
		case '7':
		case '8':
			System.out.print("����� 2���ǹ�_");
			break;
		default:
			System.out.print("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		switch (n3) {
		case '1':
			System.out.print("1�� �˻���Դϴ�.");
			break;
		case '2':
			System.out.print("2�� �˻���Դϴ�.");
			break;
		case '3':
			System.out.print("2�� �˻���Դϴ�.");
			break;
		case '4':
			System.out.print("2�� �˻���Դϴ�.");
			break;
				default:
			System.out.print("�߸��Է��ϼ̽��ϴ�.");
			break;

	}

}
}