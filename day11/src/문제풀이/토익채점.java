package 문제풀이;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 답안 999개 공간
		// 내답 999개 공간
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];
		int count = 0;
int count2 = 0;
		Random r = new Random(11);

		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1;
			내답[i] = r.nextInt(4) + 1;

		}
		System.out.println("번호  : 답안      내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "   :   " + 답안[i] + " <=>   " + 내답[i]);
			if (답안[i] == 내답[i]) {
				System.out.println("정답입니다.");
				count++;
			}
				if (답안[i] < 내답[i]) {
					count2++;
				}
			
		}
		System.out.println("총" + " 점수는 " + count + " 점 입니다.");
		System.out.println("답안이 내답보다 큰 경우는 총 "+ count2 + " 입니다.");
	}

}
