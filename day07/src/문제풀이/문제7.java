package ����Ǯ��;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ����7 {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("�ڱⰡ �����ϴ� �����ο� ��ǥ�ϼ���(1. ���缮 / 2. ������ / 3. BTS / 4. ����)");
			System.out.println("���� ��ȣ>> ");
			count++;
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("�α���ǥ�� �����մϴ�.");
				System.out.println("��ü ��ǥ Ƚ���� " + count + "�Դϴ�.");
				System.out.println("���缮 " + n1 + "ǥ �Դϴ�.");
				System.out.println("������ " + n2 + "ǥ �Դϴ�.");
				System.out.println("BTS " + n3 + "ǥ �Դϴ�.");
				break;
			}

			if (choice == 1) {
				n1++;
			} else if (choice == 2) {
				n2++;
			} else if (choice == 3) {
				n3++;
			} else
				System.out.println("���� ��ȣ�Դϴ�");
		}

	}
}
