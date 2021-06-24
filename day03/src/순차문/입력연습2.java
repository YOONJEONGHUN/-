package 순차문;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
	//오늘은 무슨 요일인가요? 목요일
	//오늘의 날씨는 어떤가요? 더워요
	//출력은 목요일은 더워요
		
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		System.out.println("오늘은 " + today + "입니다.");
		
				
		String weather = JOptionPane.showInputDialog("오늘의 날씨는 어떤가요?");
		System.out.println("오늘의 날씨는 " + weather);
		
				
		JOptionPane.showMessageDialog(null, today +"은 " + weather);
				

	}

}
