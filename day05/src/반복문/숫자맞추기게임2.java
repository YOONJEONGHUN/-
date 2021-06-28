package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 숫자맞추기게임2 {

	public static void main(String[] args) {

		//JButton b1 = new JButton();
		//JTextField name = new JTextField();
		
		Random f = new Random();
		int num = f.nextInt(100);
		
		while (true) {

			String x = JOptionPane.showInputDialog("숫자를 기입하여 맞춰보세요");
			int x1 = Integer.parseInt(x);

			if (num == x1) {
				JOptionPane.showMessageDialog(null, "정답입니다.");
				System.exit(0);
			} else {

				System.out.println("틀렸습니다.");
				if (x1 > num) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작아요.");
				}
			} // if

		} // while

	}// main
}
