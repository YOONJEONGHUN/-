package ����Ǯ��;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) {
		
		String food = JOptionPane.showInputDialog("����� �԰���� ������ �����ϼ���.");
		
		switch (food) {
		case "������":
			System.out.println("�н�������");
			break;
		case "�쵿":
			System.out.println("�Ͻ�������");
		case "¥��":
			System.out.println("�߱�������");
			break;
					default:
			System.out.println("������");
			break;
		}

	}

}
