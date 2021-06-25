package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
				
		String num1 = JOptionPane.showInputDialog("숫자1을 입력하세요");
		String num2 =JOptionPane.showInputDialog("숫자2을 입력하세요");
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		
		System.out.println(num3+num4);
		System.out.println(num3-num4);
		
	    
	} // main

} // class
