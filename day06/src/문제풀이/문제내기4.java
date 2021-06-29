package 문제풀이;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class 문제내기4 {

	public static void main(String[] args) {
	Date t1 = new Date();
	int s1 = t1.getHours();
	int s2 = t1.getMinutes()-45;
	int s3 = t1.getSeconds();
	
	System.out.println("알람시간은 " + s1 + "시 " + s2 + "분 " + s3 + "초 입니다.");
	
	
	
	Random n1 = new Random();
	Random n2 = new Random();
	JOptionPane.showMessageDialog(null, "눈1");
	JOptionPane.showMessageDialog(null, "눈2");


	

}
}