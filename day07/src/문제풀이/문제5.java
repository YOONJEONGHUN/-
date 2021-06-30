package 문제풀이;

public class 문제5 {

	public static void main(String[] args) {
		// 1부터 1000까지 중 3씩 점프해 더해주세요.
		// 만약 더한 값이 100이 넘으면 더하기를 종료.
		// 5의 배수는 더하지 않습니다.

		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i = i + 3) { // 1부터 1000까지 3씩 점프해 더함

			if (i % 5 == 0) {
				continue; // 제외한다는 뜻, 5의 배수는 제외

			}
			if (sum > 100) {
				System.out.println("100보다 값이 크므로 그만!");
				break; // for 문을 종료하고  sum을 프린트
			}
			sum = sum + i;
			count++; // 횟수를 세는것
			System.out.println(i + ":" + sum);
			System.out.println(count);
		}
		System.out.println(sum);
	}

}
