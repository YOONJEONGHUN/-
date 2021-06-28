package 반복문;

import javax.swing.JOptionPane;

public class 반복문7 {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("시작값을 넣으세요.");
		String y = JOptionPane.showInputDialog("종료값을 넣으세요.");

		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);

		while (x1 <= y1) {
			System.out.println(x1);
			x1++;
		}
	}
}
