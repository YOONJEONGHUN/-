package �迭����;

public class �迭����1 {

	public static void main(String[] args) {
		// int ũ�� 5�� �迭�� �����غ�����
		// �迭�� ũ�⸦ ����Ʈ�غ�����
		// �迭�� ù��° ��ġ�� 100�� �־ ����Ʈ
		// �迭�� ������ ��ġ�� 500�� �־ ����Ʈ
		// �迭�� 3��° ��ġ�� 200�� �־ ����Ʈ
		// �迭�� ��ü �����͸� ����Ʈ
		// �迭�� ��ü �����͸� �ε����� �Բ� ����Ʈ
		// �׸����� �׷�������
		int[] s = new int[5];
		System.out.print(s.length);

		System.out.println();

		s[0] = 100;
		System.out.print(s[0] + ", ");
		s[s.length-1] = 500;
		System.out.print(s.length-1 + ", ");
		s[2] = 200;
		System.out.print(s[2] + ", ");

		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[0] = 100;
			s[4] = 500;
			s[2] = 200;

			System.out.print(s[i] + ", ");
		}
		System.out.println();
			
		for (int i = 0; i < s.length; i++) {
							System.out.println(i + ":" + s[i]);
		}
	}
}
