package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제4 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("사원번호를 입력하세요.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);

		if (n2 == '기') {
			System.out.println("당신은 기획부입니다.");
		} else if (n2 == '인') {
			System.out.println("당신은 인사부입니다.");
		} else if (n2 == '개') {
			System.out.println("당신은 개발부입니다.");
		}

		if (n3 == '1' || n3 == '2') {
			System.out.println("당신은 임원입니다.");
		} else if (n3 == '3') {
			System.out.println("당신은 부장입니다.");
		} else if (n3 == '4' || n3 == '5') {
			System.out.println("당신은 평사원입니다.");
		} else
			System.out.println("해당 직급이 없음");
	}

}