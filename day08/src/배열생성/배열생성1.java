package 배열생성;

public class 배열생성1 {

	public static void main(String[] args) {
		// int 크기 5인 배열을 생성해보세요
		// 배열의 크기를 프린트해보세요
		// 배열의 첫번째 위치에 100을 넣어서 프린트
		// 배열의 마지막 위치에 500을 넣어서 프린트
		// 배열의 3번째 위치에 200을 넣어서 프린트
		// 배열의 전체 데이터를 프린트
		// 배열의 전체 데이터를 인덱스와 함께 프린트
		// 그림으로 그려보세요
		int[] s = new int[5];
		System.out.print(s.length);

		System.out.println();

		s[0] = 100;
		System.out.print(s[0] + ", ");
		s[s.length-1] = 500;
		System.out.print(s.length-1 + ", ");
		s[2] = 200;
		System.out.print(s[2] + ", ");

		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[0] = 100;
			s[4] = 500;
			s[2] = 200;

			System.out.print(s[i] + ", ");
		}
		System.out.println();
			
		for (int i = 0; i < s.length; i++) {
							System.out.println(i + ":" + s[i]);
		}
	}
}
