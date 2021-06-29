package 문제풀이;

import javax.swing.JOptionPane;

public class 문제내기2 {

	public static void main(String[] args) {
         String food = JOptionPane.showInputDialog("당신이 지금 하고 싶은일은?");
		
		switch (food) {
		case "운동":
			System.out.println("헬스장으로 가세요.");
			break;
		case "식사":
			System.out.println("음식점으로 가세요.");
		case "휴식":
			System.out.println("집으로 가세요");
		case "공부":
			System.out.println("학원으로 가세요");
			break;
					default:
			System.out.println("모르겠음");
			break;
	}

}
}