package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		//1-10까지 더해봅시다.
		int sum = 0; // 초기값 0 선언
		
		for (int i = 1; i <= 1000; i++) {
		sum = sum + i;
		}
System.out.println(sum); // for문이 다 돌아가고 나서 프린트
	}

}
