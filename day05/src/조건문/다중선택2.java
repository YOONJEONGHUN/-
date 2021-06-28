package 조건문;

import javax.swing.JOptionPane;

public class 다중선택2 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
		
		String score = JOptionPane.showInputDialog("당신의 점수를 기입하세요");

		int s1 = Integer.parseInt(score);

		if (s1 >= 90) {
			JOptionPane.showMessageDialog(null, "당신은 A학점 입니다.");

		} else if (s1 >= 80) {
			JOptionPane.showMessageDialog(null, "당신은 B학점 입니다.");
		} else if (s1 >= 70) {
			JOptionPane.showMessageDialog(null, "당신은 c학점 입니다.");
		} else
			JOptionPane.showMessageDialog(null, "당신은 D학점 입니다.");

	}
	}
}
