package �ݺ���;

import javax.swing.JOptionPane;

public class ���ڸ��߱���� {

	public static void main(String[] args) {

		int target = 77;

		while (true) {

			String x = JOptionPane.showInputDialog("���ڸ� �����Ͽ� ���纸����");
			int x1 = Integer.parseInt(x);

			if (target == x1) {
				JOptionPane.showMessageDialog(null, "�����Դϴ�.");
				System.exit(0);
			} else {

				System.out.println("Ʋ�Ƚ��ϴ�.");
				if (x1 > target) {
					System.out.println("�ʹ� Ů�ϴ�.");
				} else {
					System.out.println("�ʹ� �۾ƿ�.");
				}
			} // if

		} // while

	}// main
}
