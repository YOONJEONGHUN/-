package 배열사용;

public class 기본형배열2 {

	public static void main(String[] args) {
		// int[] 변수명:
		// int로 만들어진 배열을 가르키는 주소가 변수명에 들어간다.
//		static 안에 변수를 많이 넣으면 메모리를 많이 사용하게 되므로 안좋다.
		// 배열은 자동으로 초기화시켜줌.
		int[] s = new int[10];
		// I@15db9742 주소값, 배열값에 따라서 주소값이 다르다.
		Double[] s2 = new Double[5];
		String[] s3 = new String[10];

		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3[0]);
		System.out.println(s[5]);
	}

}
