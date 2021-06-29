package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제3 {

	public static void main(String[] args) {

		String sn = "980201-1037514";

		char gender = sn.charAt(7);

		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
	
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
	}

}
