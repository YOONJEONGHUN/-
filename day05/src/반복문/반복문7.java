package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���7 {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("���۰��� ��������.");
		String y = JOptionPane.showInputDialog("���ᰪ�� ��������.");

		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);

		while (x1 <= y1) {
			System.out.println(x1);
			x1++;
		}
	}
}
