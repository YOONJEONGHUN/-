package ����Ǯ��;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class ��������4 {

	public static void main(String[] args) {
	Date t1 = new Date();
	int s1 = t1.getHours();
	int s2 = t1.getMinutes()-45;
	int s3 = t1.getSeconds();
	
	System.out.println("�˶��ð��� " + s1 + "�� " + s2 + "�� " + s3 + "�� �Դϴ�.");
	
	
	
	Random n1 = new Random();
	Random n2 = new Random();
	JOptionPane.showMessageDialog(null, "��1");
	JOptionPane.showMessageDialog(null, "��2");


	

}
}