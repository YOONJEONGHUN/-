package 배열응용;

import java.util.Scanner;

public class 전화번호입력 {

	public static void main(String[] args) {
		// 전화번호 입력 011-245-1234
		// 1) 양쪽 공백을 제거하시오.
		// 2) -을 기준으로 분리하세요
		// 3) 첫번째 문자열이 011이면 sk, 019이면 LG, 나머지이면 APPLE
		// 4) 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		// 5) 세번째 문자열의 길이가 10글자 이상이면 유효한 전화번호 // 아니면 유효하지 않은 전화번호

		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력하세요>>>>>  ");
		String num = sc.nextLine();
		String n1 = num.trim();
		System.out.println(n1);
		String[] n2 = num.split("-");
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}
		System.out.println();

		if (n2[0].equals("011")) {
			System.out.println("입력하신 번호는 SK 입니다.");
		} else if (n2[0].equals("019")) {
			System.out.println("입력하신 번호는 LG 입니다.");
		} else {
			System.out.println("입력하신 번호는 APPLE 입니다.");

		}
		if (n2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		String n3 = num.replace("-", "");
		if (n3.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효한 전화번호가 아닙니다.");
		}

		sc.close();
	}
}
