package ����Ǯ��;

public class ����4 {

	public static void main(String[] args) {
		int sum1 = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) { // 3�� ���, 3���� �������� ������ ���� 0
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);

		System.out.println("-------------------");

		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
				// for���� �ݺ��϶�� ��, ���ǿ� �´� ��� �Ʒ��� �ִ� �ڵ�� ���̻� �������� ����, if���� ����϶�� �ǹ̰� �ƴ�!
			}
			if (sum2 > 20) {
				System.out.println("20���� ���� ũ�Ƿ� stop!");
				break;
			}
			sum2 = sum2 + i;

		}
		System.out.println(sum2);
	}
}