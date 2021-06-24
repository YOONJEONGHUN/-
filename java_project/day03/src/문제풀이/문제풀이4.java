package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
		//생수값은 1000, 생수구매개수 2, 마스크값 2000, 마스크구매개수3
		// 내가 지불해야할 
		// 1) 생수값 금액은?, 2) 마스크값은?, 3)총 지불금액은?
		
		int num1 = 1000;
		int num2 = 2;
		int num3 = 2000;
		int num4 = 3;
		
		System.out.println("생수값은 " + (num1*num2) + "원 입니다.");
		System.out.println("마스크 값은 " + (num3*num4) + "원 입니다.");
		System.out.println("총 지불금액은 " + (num1*num2+num3*num4) + "원 입니다.");
			}
}

				
				



