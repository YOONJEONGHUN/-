package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		//1. 변수에 저장 커피개수 5잔, 커피값 5000원, 총 커피값을 계산하고 출력
		//커피값이 20000원을 넘으면 "할인해드릴게요". 프린트, 넘지않으면 "총 커피값을 내세요"
		
		//2. 내 현재나이를 변수에 저장 100, 내 내년나이를 계산하고 출력
		// 내 내년나이가 100세를 넘으면 "이제부터 시작", 아니면 "아직 젊어요"
		
		double num = 5;
		double pay = 5000;
		double money = num*pay;
		
		JOptionPane.showConfirmDialog(null, "총 커피값은 " + money + "입니다.");
		if (money > 20000) {
			JOptionPane.showConfirmDialog(null, "할인해드릴게요.");
		} else {
			JOptionPane.showConfirmDialog(null, "총 커피값을 내세요");
		}
		
				
				
	}

}
