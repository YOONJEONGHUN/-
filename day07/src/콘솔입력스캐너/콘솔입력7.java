package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 학점을 입력하세요>>>>");
		int n1 = sc.nextInt();
		
		if (n1 >= 90) {
			System.out.println("A 학점입니다");
		} else if ( n1 >= 80) {
			System.out.println("B 학점입니다");
		} else if ( n1 >= 70) {
			System.out.println("C 학점입니다");
		} else if ( n1 >= 60) {
			System.out.println("D 학점입니다");
		} else
			System.out.println("F 학점입니다");
	}
	
	
}
