package 문제풀이;

public class 문제4 {

	public static void main(String[] args) {
		int sum1 = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) { // 3의 배수, 3으로 나눴을때 나머지 값이 0
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);

		System.out.println("-------------------");

		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
				// for문을 반복하라는 뜻, 조건에 맞는 경우 아래에 있는 코드는 더이상 실행하지 않음, if문을 계속하라는 의미가 아님!
			}
			if (sum2 > 20) {
				System.out.println("20보다 합이 크므로 stop!");
				break;
			}
			sum2 = sum2 + i;

		}
		System.out.println(sum2);
	}
}