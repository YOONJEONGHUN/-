package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		
		System.out.println("두 수의 합은 " + (x + y));
		System.out.println("두 수의 나눗셈은 " + (x / y));
		
		int sum = x + y;
		int avg1 = sum / 2;
		System.out.println("평균은 " + avg1);
		//java에서 정수와 정수의 계산은 무조건 정수!!
		// 실수값을 얻고 싶으면 하나라도 실수가 들어가야한다
		double avg2 = sum / 2.0;
		System.out.println("평균은 " + avg2);
		
		int count = 2;
		avg2 = sum / (double)count;
		System.out.println("평균은 " + avg2);
		//원래의 타입 다른 타입으로 강제로 바꾸는 것 : casting 예) 원래 int -> double		
	}

}
