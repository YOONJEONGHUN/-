package ����.������;

import javax.swing.JOptionPane;

public class �Է�ó�� {

	public static void main(String[] args) {
		
		//�Է� -> ó�� -> ���
		String hobby = JOptionPane.showInputDialog("����� ��̴�?");
		String when = JOptionPane.showInputDialog("���� �Ͻó���?");
		String time = JOptionPane.showInputDialog("�� �ð��̳� �ϼ̳���?");
		
		String result = when + "�� " + hobby + "�� �Ͻô±���!";
		int time2 = Integer.parseInt(time);
if (time2 >=3) {
	JOptionPane.showMessageDialog(null, "����Ͻñ���!");
} else {
	JOptionPane.showMessageDialog(null, "�� �� ����ϼ���!");
}
		
		JOptionPane.showMessageDialog(null, result);
		
		
	}

}
