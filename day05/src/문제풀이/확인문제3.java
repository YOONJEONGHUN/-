package ����Ǯ��;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ȯ�ι���3 {

	public static void main(String[] args) {

		while (true) {
			String m = JOptionPane.showInputDialog("������ ��� �Ͻðڽ��ϱ�? (0:��� , 1:�ߴ�)");
			int m2 = Integer.parseInt(m);
			if (m2 == 1) {
				JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "������ ����մϴ�.");
				String x = JOptionPane.showInputDialog("ù��° ����� ���ڸ� �Է����ּ���.");
				String y = JOptionPane.showInputDialog("�ι�° ����� ���ڸ� �Է����ּ���.");
				int x1 = Integer.parseInt(x);
				int y1 = Integer.parseInt(y);
				if (x1 > y1) {
					JOptionPane.showMessageDialog(null, "ù��° ����� �¸�");
				} else {
					JOptionPane.showMessageDialog(null, "�ι�° ����� �¸�");
				}

			}

		}
	}
}
