package 문제풀이;

import javax.swing.JOptionPane;

public class 문제6 {

	public static void main(String[] args) {

		int yes = 0, no = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고픈가요?(배가 고프면 1, 배가 안고프면2)");
			switch (reply) {
			case "1":
				yes++;
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2중 하나를 선택해주세요");
				i--;
				break;
			}
		}
		System.out.println("배고픈 사람: " + yes + "명");
		System.out.println("배안고픈 사람: " + no + "명");
	}
}
