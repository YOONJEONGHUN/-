package 복습.순차문;

import javax.swing.JOptionPane;

public class 입력처리 {

	public static void main(String[] args) {
		
		//입력 -> 처리 -> 출력
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제 하시나요?");
		String time = JOptionPane.showInputDialog("몇 시간이나 하셨나요?");
		
		String result = when + "에 " + hobby + "을 하시는군요!";
		int time2 = Integer.parseInt(time);
if (time2 >=3) {
	JOptionPane.showMessageDialog(null, "대단하시군요!");
} else {
	JOptionPane.showMessageDialog(null, "좀 더 노력하세요!");
}
		
		JOptionPane.showMessageDialog(null, result);
		
		
	}

}
