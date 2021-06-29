package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제내기3 {

	public static void main(String[] args) {
        //끝자리가 1인 날마다 아이스크림 할인을 받을 수 있다. 또한, 자신의 생년월일 끝자리가 3일 경우에도 할인 받을 수 있다.
//		1) 오늘이 며칠인지 입력하기 & 생년월일 6자리 입력
//	2) 끝자리가 1로 끝나면 할인 받는 날!
//	   그 외는 정가
		
	String m1 = JOptionPane.showInputDialog("오늘은 며칠인가요?");
	String d1 = JOptionPane.showInputDialog("당신의 생년월일 6자리를 입력하세요.");
	
	char m2 = m1.charAt(1);
    char d2 = d1.charAt(5);
	if (m2 == '1' || d2 == '3') {
		System.out.println("아이스크림을 할인 받으실 수 있습니다.");
	} else {
		System.out.println("안타깝게도, 아이스크림을 할인 받으실 수 없습니다.");
	}
		
	}

}
