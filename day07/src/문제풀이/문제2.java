package 문제풀이;

public class 문제2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 55; i <=4500; i = i + 2) { // i값을 55부터 시작하여 4500까지 2씩 더한다.
		sum = sum + i;	
		}
		System.out.println(sum);
	}

}
