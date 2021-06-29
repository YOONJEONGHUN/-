package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 정리문제5 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("나이를 입력하세요");
		int n2 = Integer.parseInt(n1);
		Date year = new Date();
		int y1 = year.getYear() - n2 + 1900;
		System.out.println("당신이 태어난 연도는 " + y1 + " 입니다.");

		String t1 = JOptionPane.showInputDialog("당신이 태어난 시각을 입력하세요");
		int t2 = Integer.parseInt(t1);
		Date hour = new Date();
		int t3 = hour.getHours();
		switch (t3) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("당신은 오전에 태어나셨군요");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("당신은 오후에 태어나셨군요");
			break;
		case 21:
		case 22:
			System.out.println("당신은 늦은 저녁에 태어나셨군요");
			break;
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("당신은 새벽에 태어나셨군요");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
}
