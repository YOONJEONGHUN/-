package ����Ǯ��;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) {
         String food = JOptionPane.showInputDialog("����� ���� �ϰ� ��������?");
		
		switch (food) {
		case "�":
			System.out.println("�ｺ������ ������.");
			break;
		case "�Ļ�":
			System.out.println("���������� ������.");
		case "�޽�":
			System.out.println("������ ������");
		case "����":
			System.out.println("�п����� ������");
			break;
					default:
			System.out.println("�𸣰���");
			break;
	}

}
}