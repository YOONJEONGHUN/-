package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڸ��߱����4 {

	public static void main(String[] args) {

		Random r = new Random(3);
		int target = r.nextInt(50)+5;
		

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
