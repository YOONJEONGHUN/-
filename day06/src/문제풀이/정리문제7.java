package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 정리문제7 {

	public static void main(String[] args) {

		// 나이를 입력
		// 태어난 연도는 2020년( Date 이용)
		// 태어난 시각 입력
		// 오전에 태어나셨군요. 등

		String age = JOptionPane.showInputDialog("나이를 입력하세요");
		int age2 = Integer.parseInt(age);

		Date date = new Date();
		int result1 = date.getYear() + 1900 - age2 + 1;
		System.out.println("당신이 태어난 연도는 " + result1 + "입니다.");
	}
}
