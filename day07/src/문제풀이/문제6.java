package ����Ǯ��;

import javax.swing.JOptionPane;

public class ����6 {

	public static void main(String[] args) {

		int yes = 0, no = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("�谡 ���°���?(�谡 ������ 1, �谡 �Ȱ�����2)");
			switch (reply) {
			case "1":
				yes++;
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2�� �ϳ��� �������ּ���");
				i--;
				break;
			}
		}
		System.out.println("����� ���: " + yes + "��");
		System.out.println("��Ȱ��� ���: " + no + "��");
	}
}
