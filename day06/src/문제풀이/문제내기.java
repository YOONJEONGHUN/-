package ����Ǯ��;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("����� �˻��ȣ�� �Է��ϼ���.");

		char n2 = n1.charAt(0);
		char n3 = n1.charAt(1);
		
		

		if (n2 >='1' || n2 <='4') {
			System.out.print("����� 1���ǹ�_");
		} else if(n2 >='5' || n2 <= '8'){
			System.out.print("����� 2���ǹ�_");
		} else
			System.out.print("�߸��Է��ϼ̽��ϴ�.");
			
		switch (n3) {
		case '1':
			System.out.print("1�� �˻���Դϴ�.");
			break;
		case '2':
			System.out.print("2�� �˻���Դϴ�.");
			break;
		case '3':
			System.out.print("2�� �˻���Դϴ�.");
			break;
		case '4':
			System.out.print("2�� �˻���Դϴ�.");
			break;
				default:
			System.out.print("�߸��Է��ϼ̽��ϴ�.");
			break;

	}

}
}