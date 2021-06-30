package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저녁을 먹었는지 입력하세요. true / false");
		Boolean yn = sc.nextBoolean();

		if (yn) {
			System.out.println("배가 부르시겠군요!");

		} else {
			System.out.println("배가 고프시겠군요");
		}
	}
}