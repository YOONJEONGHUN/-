package �ݺ���;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ���ڸ��߱����2 {

	public static void main(String[] args) {

		//JButton b1 = new JButton();
		//JTextField name = new JTextField();
		
		Random f = new Random();
		int num = f.nextInt(100);
		
		while (true) {

			String x = JOptionPane.showInputDialog("���ڸ� �����Ͽ� ���纸����");
			int x1 = Integer.parseInt(x);

			if (num == x1) {
				JOptionPane.showMessageDialog(null, "�����Դϴ�.");
				System.exit(0);
			} else {

				System.out.println("Ʋ�Ƚ��ϴ�.");
				if (x1 > num) {
					System.out.println("�ʹ� Ů�ϴ�.");
				} else {
					System.out.println("�ʹ� �۾ƿ�.");
				}
			} // if

		} // while

	}// main
}
