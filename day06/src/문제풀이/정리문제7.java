package ����Ǯ��;

import java.util.Date;

import javax.swing.JOptionPane;

public class ��������7 {

	public static void main(String[] args) {

		// ���̸� �Է�
		// �¾ ������ 2020��( Date �̿�)
		// �¾ �ð� �Է�
		// ������ �¾�̱���. ��

		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		int age2 = Integer.parseInt(age);

		Date date = new Date();
		int result1 = date.getYear() + 1900 - age2 + 1;
		System.out.println("����� �¾ ������ " + result1 + "�Դϴ�.");
	}
}
