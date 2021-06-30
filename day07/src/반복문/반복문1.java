package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		int sum = 0; // 초기값 0 선언
		
		for (int i = 1; i <= 10 ; i++) { // 1부터 시작하는 i변수를 10까지 1씩 더하는 반복문
			sum = sum + i; // 더하는 결과값에 i 변수를 더해서 다시 sum 변수로 저장
			System.out.println(sum); // sum 변수를 프린트
		}

	}

}
