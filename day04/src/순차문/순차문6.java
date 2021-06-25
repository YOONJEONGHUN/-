package 순차문;

import javax.swing.JOptionPane;

public class 순차문6 {

	public static void main(String[] args) {

		//내가 먹고 싶은 음식은? 팥빙수
		// 친구가 먹고 싶은 음식은? 팥빙수
		// "아하! 나랑 친구랑 같아요!"
		// "크~! 나랑 친구랑 달라요!
		
		String num1 = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String num2 = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		if (num1.equals(num2)) {
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
		} else {
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");
		}
		
	} // main

} // class
