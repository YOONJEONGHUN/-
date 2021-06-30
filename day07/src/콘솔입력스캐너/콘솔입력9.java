package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안정성 점수를 입력하세요>>>>");
		Double n1 = sc.nextDouble();
		System.out.println("속도 점수를 입력하세요>>>>");
		Double n2 = sc.nextDouble();
		System.out.println("연비 점수를 입력하세요>>>>");
		Double n3 = sc.nextDouble();

		Double result = n1 * 0.3 + n2 * 0.5 + n3 * 0.2;

		String grade = null;

		if (result >= 90) {
			grade = "최우수";
		} else if (result >= 80) {
			grade = "우수";
		} else if (result >= 70) {
			grade = "보통";
		} else {
			grade = "미달";
		}
		System.out.println(result + "점 " + grade + "입니다.");
	}
}
