package 조건문;

public class 다중선택 {

	public static void main(String[] args) {

		int score = 66;

		String result = "";

		if (score >= 90) {
			result = "A 학점";

		} else if (score >= 80) {
			result = "B 학점";
		} else if (score >= 70) {
			result = "C 학점";
		} else
			result = "F 학점";

		System.out.println("당신의 학점은 " + result + "입니다.");

	}
}
