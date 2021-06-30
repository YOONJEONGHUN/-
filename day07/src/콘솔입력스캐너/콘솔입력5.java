package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 과목을 입력하세요.(자바, C, PYTHON)>>>");
		String data = sc.next();
		if (data.equals("자바")) {
			System.out.println("JSP로 점프!!");
		}if (data.equals("C")) {
				System.out.println("C++로 점프!!");
		}		if (data.equals("PYTHON")) {
					System.out.println("모름!");
		}
			}
	}
