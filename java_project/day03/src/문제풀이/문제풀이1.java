package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		//int x = 111;
	//		int y = 222;
	//		x > y 면 x 가 더 커요.
	//		그게 아니면 y 가 더 크거나 같아요.
		
		int x = 111;
		int y = 222;
					
		if (x > y) {
			JOptionPane.showMessageDialog(null, "더 커요");
		} else {
			JOptionPane.showMessageDialog(null, "더 크거나 같아요");
		}
		
	}

}
