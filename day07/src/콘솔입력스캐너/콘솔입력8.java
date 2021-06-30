package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안정성 점수를 입력하세요>>>>");
		Double n1 = sc.nextDouble();
		System.out.println("속도 점수를 입력하세요>>>>");
		Double n2 = sc.nextDouble();
		System.out.println("연비 점수를 입력하세요>>>>");
		Double n3 = sc.nextDouble();
		
		Double result = n1*0.3 + n2*0.5 + n3*0.2;
		
		if (result >= 90) {
			System.out.println(result + "점 최우수입니다.");
		} else if (result >=80) {
			System.out.println(result + "점 우수입니다.");
		} else if (result >=70) {
			System.out.println(result + "점 보통입니다.");
		} else {
				System.out.println(result + "점 미달입니다.");
		}

		}
}
