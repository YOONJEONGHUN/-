package ����Ǯ��;

import java.util.Date;

import javax.swing.JOptionPane;

public class ��������3 {

	public static void main(String[] args) {
        //���ڸ��� 1�� ������ ���̽�ũ�� ������ ���� �� �ִ�. ����, �ڽ��� ������� ���ڸ��� 3�� ��쿡�� ���� ���� �� �ִ�.
//		1) ������ ��ĥ���� �Է��ϱ� & ������� 6�ڸ� �Է�
//	2) ���ڸ��� 1�� ������ ���� �޴� ��!
//	   �� �ܴ� ����
		
	String m1 = JOptionPane.showInputDialog("������ ��ĥ�ΰ���?");
	String d1 = JOptionPane.showInputDialog("����� ������� 6�ڸ��� �Է��ϼ���.");
	
	char m2 = m1.charAt(1);
    char d2 = d1.charAt(5);
	if (m2 == '1' || d2 == '3') {
		System.out.println("���̽�ũ���� ���� ������ �� �ֽ��ϴ�.");
	} else {
		System.out.println("��Ÿ���Ե�, ���̽�ũ���� ���� ������ �� �����ϴ�.");
	}
		
	}

}
