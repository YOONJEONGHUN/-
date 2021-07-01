package 배열생성;

public class 배열생성2 {

	public static void main(String[] args) {
		// 목록값을 처음에 알고 있는경우
		// 배열을 만들때, 처음부터 값들을 알고 있는경우와 모르는 경우를 다르게 쓴다.
		String[] names = {"홍동","송동","정동","안동","김동"};
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			System.out.print(names[i]);
			
		}
		System.out.println();
		
		int[] ages = {100, 88, 55, 33, 10};
		for (int i = 0; i < ages.length; i++) {
			int j = ages[i];
			System.out.print(ages[i] + ", "); // 입력용 for 문 <== 자리의 값을 넣고 싶을때는 꼭 다음의 for문을 사용해야 한다.
		}
		System.out.println();
		for (int x : ages) {
			System.out.println(x);  // 출력용 for문
		}
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int i = 0; i < eyes.length; i++) {
			double d = eyes[i];
			System.out.println(eyes[i]);
		}
		char[] gender = {'남', '여', '남', '여', '남'};
		for (int i = 0; i < gender.length; i++) {
			char c = gender[i];
			System.out.println(gender[i]);
		}
		boolean[] food = {true, false, true, true, false};
		for (int i = 0; i < food.length; i++) {
			boolean b = food[i];
			System.out.println(food[i]);
		}
		}
	}

