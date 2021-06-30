package 문제풀이;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문제7 {

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("자기가 좋아하는 연예인에 투표하세요(1. 유재석 / 2. 아이유 / 3. BTS / 4. 종료)");
			System.out.println("선택 번호>> ");
			count++;
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("인기투표를 종료합니다.");
				System.out.println("전체 투표 횟수는 " + count + "입니다.");
				System.out.println("유재석 " + n1 + "표 입니다.");
				System.out.println("아이유 " + n2 + "표 입니다.");
				System.out.println("BTS " + n3 + "표 입니다.");
				break;
			}

			if (choice == 1) {
				n1++;
			} else if (choice == 2) {
				n2++;
			} else if (choice == 3) {
				n3++;
			} else
				System.out.println("없는 번호입니다");
		}

	}
}
