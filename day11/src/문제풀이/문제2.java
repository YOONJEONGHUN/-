package 문제풀이;

public class 문제2 {

	public static void main(String[] args) {
		// 과목명 = {"국어","영어","수학","컴퓨터","회화"}
		// 1학기 성적 = {44,66,22,99,100}

		String[] subject = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] score1 = { 44, 66, 22, 99, 100 };
		int[] score2 = score1.clone();
		int count = 0;
		int count2 = 0;
		score2[2] = 88;
		System.out.println("과목명 : 1학기   2학기");
		for (int i = 0; i < score1.length; i++) {
			System.out.println(subject[i] + "  : " + score1[i] + ",   " + score2[i]);
		}
		for (int i = 0; i < score1.length; i++) {
			if (score1[i] == score2[i]) {
				count++;
			}
			if (score1[i] < score2[i]) {
				count2++;
				System.out.println("성적이 오른 과목은 " + subject[i]);
			}
		}

		System.out.println("1,2학기 동일한 성적의 과목수는 " + count + " 과목");
		System.out.println("성적이 오른 과목수는 " + count2 + " 과목");
	}
}
