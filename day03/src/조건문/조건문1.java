package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {
		int temp = 25;
	//	if (condition) {
			//조건이 true이면 실행시키고 싶은 코드를 넣는다.
			
	//	}else {
			//조건이 false이면 실행시키고 싶은 코드를 넣는다.
			
		
if (temp > 27) {
	JOptionPane.showMessageDialog(null, "에어컨ON");
} else {
	JOptionPane.showMessageDialog(null, "에어컨OFF");
}
	}

}
