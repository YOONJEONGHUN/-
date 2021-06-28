package 문제풀이;

import java.util.Random;

public class 확인문제2 {

	public static void main(String[] args) {
	// 랜덤문제
		//랜덤한 숫자를 2개 발생시켜서
		//첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
		//두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		
Random r = new Random(); // 무작위의 r 값을 생성(정수,실수)	


int x1 = r.nextInt(100); // 0~99까지의 무작위의 r 값을 생성하여 정수 x1 으로 RAM에 저장
int x2 = r.nextInt(100); // 0~99까지의 무작위의 r 값을 생성하여 정수 x2 으로 RAM에 저장

if (x1 > x2) {
	System.out.println("첫번째 숫자가 더 커요"); // x1이 x2보다 클 경우 출력
} else {
	System.out.println("두번째 숫자가 더 커요"); // x2이 x1보다 클 경우 출력
}
		
	
	}

}
