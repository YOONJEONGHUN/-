package �ܼ��Է½�ĳ��;

import java.util.Scanner;

public class �ܼ��Է�9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���>>>>");
		Double n1 = sc.nextDouble();
		System.out.println("�ӵ� ������ �Է��ϼ���>>>>");
		Double n2 = sc.nextDouble();
		System.out.println("���� ������ �Է��ϼ���>>>>");
		Double n3 = sc.nextDouble();

		Double result = n1 * 0.3 + n2 * 0.5 + n3 * 0.2;

		String grade = null;

		if (result >= 90) {
			grade = "�ֿ��";
		} else if (result >= 80) {
			grade = "���";
		} else if (result >= 70) {
			grade = "����";
		} else {
			grade = "�̴�";
		}
		System.out.println(result + "�� " + grade + "�Դϴ�.");
	}
}
