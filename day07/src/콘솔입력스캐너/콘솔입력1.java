package 콘솔입력스캐너;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력>>> ");
int n1 = sc.nextInt();
System.out.println("숫자2 입력>>> ");
int n2 = sc.nextInt();

if (n1 > n2)
	System.out.println("첫번째 숫자가 같습니다.");
else if (n1 < n2) {
	System.out.println("두번째 숫자가 큽니다.");
} else {
	System.out.println("두 숫자가 같습니다.");
}
	}
	

}
