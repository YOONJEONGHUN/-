package ����Ǯ��;

import javax.swing.JOptionPane;

public class Ȯ�ι���1 {

	public static void main(String[] args) {
		//�簢���� ���̸� ������, ���� : 33.3, ���� :22.2
				//�簢���� ���̴� ??? �Դϴ�
		
	String x = JOptionPane.showInputDialog(null, "������ ���̴�?");
	String y = JOptionPane.showInputDialog(null, "������ ���̴�?");
	
	double x1 = Double.parseDouble( x );
	double y1 = Double.parseDouble( y );
	
	double t = (x1 * y1);
	
	JOptionPane.showMessageDialog(null, "�簢���� ���̴� " + t + "�Դϴ�.");

	}

}
