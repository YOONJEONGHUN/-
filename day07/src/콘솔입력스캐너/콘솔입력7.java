package �ܼ��Է½�ĳ��;

import java.util.Scanner;

public class �ܼ��Է�7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ���>>>>");
		int n1 = sc.nextInt();
		
		if (n1 >= 90) {
			System.out.println("A �����Դϴ�");
		} else if ( n1 >= 80) {
			System.out.println("B �����Դϴ�");
		} else if ( n1 >= 70) {
			System.out.println("C �����Դϴ�");
		} else if ( n1 >= 60) {
			System.out.println("D �����Դϴ�");
		} else
			System.out.println("F �����Դϴ�");
	}
	
	
}
