package ����Ǯ��;

import javax.swing.JOptionPane;

public class ����9 {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("�ڱⰡ �����ϴ� �����ο� ��ǥ�ϼ���(1. ���缮 / 2. ������ / 3. BTS)");
			switch (reply) {
			case "1":
				n1++; 
				break;
			case "2":
				n2++;
				break;
			case "3":
				n3++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2, 3�� �ϳ��� �������ּ���");
				i--;
				break;
			}
		}
		System.out.println("���缮: " + n1 + "��");
		System.out.println("������: " + n2 + "��");
		System.out.println("BTS: " + n3 + "��");
	}
}
