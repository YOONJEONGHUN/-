package 문제풀이;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[5];

		while (true) {
			System.out.println("=======================");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("=====================");
			for (int j = 0; j < seat.length; j++) {
				System.out.print(seat[j] + "  ");
			}

			System.out.println();
			System.out.println("=====================");
			System.out.println("좌석을 선택하세요(종료는 0번) >>>>>>   ");
			int x = sc.nextInt();
				
			if (x == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			if (seat[x] != 1) {
				seat[x] = 1;
			System.out.print(x + "번째 자리가 예약되었습니다.");
		
			}
		}
		sc.close();
		
		}

	}
