package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력 -> 처리 -> 출력의 순서
		// 1) 입력 : JOptionPane, swing
		// 모든 입력데이터는 스트링으로 읽어온다
		// 숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가 결정, 숫자로 써야한다면 숫자로 변환하는 처리를 해주어야한다.
		// 변환하는 과정(변환하는 처리 부품을 찾아서)을 입력해야한다!
		// 2) 처리
		// 3) 출력

			String D = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
			String D1 = "금요일";
	
			if (D.equals(D1)) {
				JOptionPane.showMessageDialog(null, "맞습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "틀립니다.");
			}
	} // main

} // class
