package �迭����;

public class �迭����2 {

	public static void main(String[] args) {
		// ��ϰ��� ó���� �˰� �ִ°��
		// �迭�� ���鶧, ó������ ������ �˰� �ִ°��� �𸣴� ��츦 �ٸ��� ����.
		String[] names = {"ȫ��","�۵�","����","�ȵ�","�赿"};
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			System.out.print(names[i]);
			
		}
		System.out.println();
		
		int[] ages = {100, 88, 55, 33, 10};
		for (int i = 0; i < ages.length; i++) {
			int j = ages[i];
			System.out.print(ages[i] + ", "); // �Է¿� for �� <== �ڸ��� ���� �ְ� �������� �� ������ for���� ����ؾ� �Ѵ�.
		}
		System.out.println();
		for (int x : ages) {
			System.out.println(x);  // ��¿� for��
		}
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int i = 0; i < eyes.length; i++) {
			double d = eyes[i];
			System.out.println(eyes[i]);
		}
		char[] gender = {'��', '��', '��', '��', '��'};
		for (int i = 0; i < gender.length; i++) {
			char c = gender[i];
			System.out.println(gender[i]);
		}
		boolean[] food = {true, false, true, true, false};
		for (int i = 0; i < food.length; i++) {
			boolean b = food[i];
			System.out.println(food[i]);
		}
		}
	}

