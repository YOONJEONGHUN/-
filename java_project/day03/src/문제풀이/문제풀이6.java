package 문제풀이;

public class 문제풀이6 {

	public static void main(String[] args) {
		//국어점수 75, 수학점수 50을 변수에 저장
		// 국어점수와 수학점수의 총합을 구해서 프린트, 평균을 구해서 프린트
		int num1 = 75;
				int num2 = 50;
				
				System.out.println("국어점수는 " + num1 + "입니다.");
				System.out.println("수학점수는 " + num2 + "입니다.");
				System.out.println("국어점수와 수학점수의 총합은 " + (num1+num2) + "입니다.");
				System.out.println("국어점수와 수학점수의 평균은 " + ((double)(num1+num2)/2) + "입니다.");
	}

}
