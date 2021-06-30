package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저녁을 먹었는지 입력하세요. (Y or N)>>>>");

		String yn = sc.next();

		switch (yn) {
		case "Y":
			System.out.println("배가 부르시겠군요");
			break;
		case "N":
			System.out.println("배가 고프시겠군요");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}

	}
}
