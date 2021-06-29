package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제 {

	public static void main(String[] args) {
		
		String food = JOptionPane.showInputDialog("당신이 먹고싶은 음식을 기입하세요.");
		
		switch (food) {
		case "떡볶이":
			System.out.println("분식집으로");
			break;
		case "우동":
			System.out.println("일식집으로");
		case "짜장":
			System.out.println("중국집으로");
			break;
					default:
			System.out.println("집에서");
			break;
		}

	}

}
