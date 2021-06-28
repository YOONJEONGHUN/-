package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 숫자맞추기게임3 {

	public static void main(String[] args) {

		Random f = new Random(60);
		int num = f.nextInt(45)+5;
		int num1 = f.nextInt(100);
		int num2 = f.nextInt(1000);
		int num3 = f.nextInt(20)+3;
		System.out.println(num);
		

	}

}
