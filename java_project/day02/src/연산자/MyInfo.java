package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		// 나의 대한 정보
		// 이름, 나이, 키, 성별, 점심식사 여부
		String name = "윤정훈"; // 문자열을 표기할때 String
		int age = 100;
		double weight = 90.8;
		char gender = 'M';
		boolean food = true; // false

		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(gender);
		System.out.println(food);

		weight = weight - 10;
		System.out.println(weight);
	}

}
