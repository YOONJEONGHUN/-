package 문제풀이;

import javax.swing.JOptionPane;

public class 문제9 {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("자기가 좋아하는 연예인에 투표하세요(1. 유재석 / 2. 아이유 / 3. BTS)");
			switch (reply) {
			case "1":
				n1++; 
				break;
			case "2":
				n2++;
				break;
			case "3":
				n3++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2, 3중 하나를 선택해주세요");
				i--;
				break;
			}
		}
		System.out.println("유재석: " + n1 + "명");
		System.out.println("아이유: " + n2 + "명");
		System.out.println("BTS: " + n3 + "명");
	}
}
