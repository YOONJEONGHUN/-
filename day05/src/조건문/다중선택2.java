package ���ǹ�;

import javax.swing.JOptionPane;

public class ���߼���2 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
		
		String score = JOptionPane.showInputDialog("����� ������ �����ϼ���");

		int s1 = Integer.parseInt(score);

		if (s1 >= 90) {
			JOptionPane.showMessageDialog(null, "����� A���� �Դϴ�.");

		} else if (s1 >= 80) {
			JOptionPane.showMessageDialog(null, "����� B���� �Դϴ�.");
		} else if (s1 >= 70) {
			JOptionPane.showMessageDialog(null, "����� c���� �Դϴ�.");
		} else
			JOptionPane.showMessageDialog(null, "����� D���� �Դϴ�.");

	}
	}
}
