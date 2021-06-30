package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력>>> ");
		int n1 = sc.nextInt() + 1;
		System.out.println("내년 나이는 " + n1 + "세");

		System.out.print("키 입력>>> ");
		Double n2 = sc.nextDouble() + 10;
		System.out.println("내년 키는 " + n2 + "cm");

	}
}
