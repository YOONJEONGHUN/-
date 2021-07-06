package 문제풀이;

public class 성적확인 {

	public static void main(String[] args) {
		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		int count = 0;
		int count2 = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
			if (term1[i] == term2[i]) {
				count2++;
			System.out.println("1,2학기 성적이 동일한 과목은 " + subject[i]);	
			}

		}
		System.out.println("2학기에 성적이 향상된 과목의 수는 " + count + " 입니다.");
		System.out.println("1,2학기에 성적이 동일한 과목의 수는 " + count2 + " 입니다.");
//1. 성적이 2학기 향상된 과목의 수를 카운트해보세요
//2. 성적이 1,2학기 동일한 과목의 수를 카운트해보세요
//3. 성적이 1,2학기 동일한 과목명을 프린해보세요
	}

}
