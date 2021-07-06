package 문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사
		int[] x = { 1, 2, 3 };
		int[] y = x; // 얕은 shallow 복사 -> 주소만 복사
		
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		int[] z = x.clone(); // 깊은복사
		System.out.println();
		System.out.print("z: ");
		for (int i : z) {
			System.out.print(i + " ");
		}
		System.out.println("\n==원본 x값 수정후==");
		x[0] = 9;
	}
}