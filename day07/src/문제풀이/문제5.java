package ����Ǯ��;

public class ����5 {

	public static void main(String[] args) {
		// 1���� 1000���� �� 3�� ������ �����ּ���.
		// ���� ���� ���� 100�� ������ ���ϱ⸦ ����.
		// 5�� ����� ������ �ʽ��ϴ�.

		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i = i + 3) { // 1���� 1000���� 3�� ������ ����

			if (i % 5 == 0) {
				continue; // �����Ѵٴ� ��, 5�� ����� ����

			}
			if (sum > 100) {
				System.out.println("100���� ���� ũ�Ƿ� �׸�!");
				break; // for ���� �����ϰ�  sum�� ����Ʈ
			}
			sum = sum + i;
			count++; // Ƚ���� ���°�
			System.out.println(i + ":" + sum);
			System.out.println(count);
		}
		System.out.println(sum);
	}

}
