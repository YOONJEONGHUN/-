package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		// 330점 만점

		int count = 0;
		Random r = new Random(5);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331);
			if (jumsu[i] == 330) {
				count++;
				System.out.println("번호" + i);
			}
		}
		// 수능 만점자는 몇 명일까요?
		// 만점자 번호는 몇 번?
		System.out.println(count);

	}

}
