package 문제풀이;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in); 
		System.out.print("당신의 이름을 입력하시오.>>>> ");
		String name = n1.next(); // String 입력, 단어를 가지고 옴, 공백이 있으면 인식하지 않음
		System.out.println("당신의 이름은 " + name);
		System.out.print("당신의 소속을 입력하시오.>>>> ");
		String com = n1.next();
		System.out.println("당신의 소속은 " + com);

	}
}
