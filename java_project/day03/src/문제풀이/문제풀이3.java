package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이3 {

	public static void main(String[] args) {
		
		//2. 내 현재나이를 변수에 저장 100, 내 내년나이를 계산하고 출력
		// 내 내년나이가 100세를 넘으면 "이제부터 시작", 아니면 "아직 젊어요"
		
		double day = 30;
		double tomorrow = day+1;
		JOptionPane.showConfirmDialog(null, "당신은 " + tomorrow + "살 입니다.");
		
		for (int i = 31; i <= 100; i++) {
			if (tomorrow >= 100) {
				JOptionPane.showConfirmDialog(null, "이제부터 시작");
			} else {
				JOptionPane.showConfirmDialog(null, "당신은" + (i) + "살입니다. 아직 젊어요");
			}
				
		
		
		}
	}
}

				
				



