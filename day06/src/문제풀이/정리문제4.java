package ����Ǯ��;

import javax.swing.JOptionPane;

public class ��������4 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("�����ȣ�� �Է��ϼ���.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);

		if (n2 == '��') {
			System.out.println("����� ��ȹ���Դϴ�.");
		} else if (n2 == '��') {
			System.out.println("����� �λ���Դϴ�.");
		} else if (n2 == '��') {
			System.out.println("����� ���ߺ��Դϴ�.");
		}

		if (n3 == '1' || n3 == '2') {
			System.out.println("����� �ӿ��Դϴ�.");
		} else if (n3 == '3') {
			System.out.println("����� �����Դϴ�.");
		} else if (n3 == '4' || n3 == '5') {
			System.out.println("����� �����Դϴ�.");
		} else
			System.out.println("�ش� ������ ����");
	}

}