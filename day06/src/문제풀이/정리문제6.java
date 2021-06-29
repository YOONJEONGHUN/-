package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제6 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("사원번호를 입력하세요.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);

		switch (n2) {
		case '기':
			System.out.print("당신은 기획부_");
			break;
		case '인':
			System.out.print("당신은 인사부_");
			break;
		case '개':
			System.out.print("당신은 개발부_");
			break;
		default:
			break;
		}
		switch (n3) {
		case '1':
		case '2':
			System.out.print("임원입니다.");
			break;
		case '3':
			System.out.print("부장입니다.");
			break;
		case '4':
		case '5':
			System.out.print("평사원입니다.");
			break;
		default:
			System.out.print("해당직급 없습니다.");
			break;
		}
	}
}