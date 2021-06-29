package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제2 {

	public static void main(String[] args) {

		String sn = "980201-1037514";

		char gender = sn.charAt(7);

		if (gender == '1' || gender == '3') {
			System.out.println("당신은 남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("당신은 여자입니다.");
		} else
			System.out.println("잘못 입력하셨습니다.");
	}
}
