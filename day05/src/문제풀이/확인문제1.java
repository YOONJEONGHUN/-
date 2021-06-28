package 문제풀이;

import javax.swing.JOptionPane;

public class 확인문제1 {

	public static void main(String[] args) {
		//사각형의 넓이를 구하자, 가로 : 33.3, 세로 :22.2
				//사각형의 넓이는 ??? 입니다
		
	String x = JOptionPane.showInputDialog(null, "가로의 길이는?");
	String y = JOptionPane.showInputDialog(null, "세로의 길이는?");
	
	double x1 = Double.parseDouble( x );
	double y1 = Double.parseDouble( y );
	
	double t = (x1 * y1);
	
	JOptionPane.showMessageDialog(null, "사각형의 넓이는 " + t + "입니다.");

	}

}
