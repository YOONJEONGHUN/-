package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 확인문제3 {

	public static void main(String[] args) {

		while (true) {
			String m = JOptionPane.showInputDialog("게임을 계속 하시겠습니까? (0:계속 , 1:중단)");
			int m2 = Integer.parseInt(m);
			if (m2 == 1) {
				JOptionPane.showMessageDialog(null, "게임을 중지합니다.");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "게임을 계속합니다.");
				String x = JOptionPane.showInputDialog("첫번째 사람의 숫자를 입력해주세요.");
				String y = JOptionPane.showInputDialog("두번째 사람의 숫자를 입력해주세요.");
				int x1 = Integer.parseInt(x);
				int y1 = Integer.parseInt(y);
				if (x1 > y1) {
					JOptionPane.showMessageDialog(null, "첫번째 사람이 승리");
				} else {
					JOptionPane.showMessageDialog(null, "두번째 사람이 승리");
				}

			}

		}
	}
}
