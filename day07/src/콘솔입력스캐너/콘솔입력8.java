package �ܼ��Է½�ĳ��;

import java.util.Scanner;

public class �ܼ��Է�8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���>>>>");
		Double n1 = sc.nextDouble();
		System.out.println("�ӵ� ������ �Է��ϼ���>>>>");
		Double n2 = sc.nextDouble();
		System.out.println("���� ������ �Է��ϼ���>>>>");
		Double n3 = sc.nextDouble();
		
		Double result = n1*0.3 + n2*0.5 + n3*0.2;
		
		if (result >= 90) {
			System.out.println(result + "�� �ֿ���Դϴ�.");
		} else if (result >=80) {
			System.out.println(result + "�� ����Դϴ�.");
		} else if (result >=70) {
			System.out.println(result + "�� �����Դϴ�.");
		} else {
				System.out.println(result + "�� �̴��Դϴ�.");
		}

		}
}
