package �ܼ��Է½�ĳ��;

import java.util.Scanner;

public class �ܼ��Է�3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Ծ����� �Է��ϼ���. (Y or N)>>>>");

		String yn = sc.next();

		switch (yn) {
		case "Y":
			System.out.println("�谡 �θ��ðڱ���");
			break;
		case "N":
			System.out.println("�谡 �����ðڱ���");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}

	}
}
