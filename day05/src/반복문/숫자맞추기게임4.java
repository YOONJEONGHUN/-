package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임4 {

	public static void main(String[] args) {

		Random r = new Random(3);
		int target = r.nextInt(50)+5;
		

		while (true) {

			String x = JOptionPane.showInputDialog("숫자를 기입하여 맞춰보세요");
			int x1 = Integer.parseInt(x);

			if (target == x1) {
				JOptionPane.showMessageDialog(null, "정답입니다.");
				System.exit(0);
			} else {

				System.out.println("틀렸습니다.");
				if (x1 > target) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작아요.");
				}
			} // if

		} // while

	}// main
}
