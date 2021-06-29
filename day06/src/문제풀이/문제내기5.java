package 문제풀이;

import javax.swing.JOptionPane;

public class 문제내기5 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("당신의 검사번호를 입력하세요.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);

		switch (n2) {
		case '1':
		case '2':
		case '3':
		case '4':
			System.out.print("당신은 1번건물_");
			break;
		case '5':
		case '6':
		case '7':
		case '8':
			System.out.print("당신은 2번건물_");
			break;
		default:
			System.out.print("잘못입력하셨습니다.");
			break;
		}
		switch (n3) {
		case '1':
			System.out.print("1번 검사실입니다.");
			break;
		case '2':
			System.out.print("2번 검사실입니다.");
			break;
		case '3':
			System.out.print("2번 검사실입니다.");
			break;
		case '4':
			System.out.print("2번 검사실입니다.");
			break;
				default:
			System.out.print("잘못입력하셨습니다.");
			break;

	}

}
}