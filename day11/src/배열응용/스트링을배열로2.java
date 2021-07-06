package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String s1 = " 감자    ";
		System.out.println(s1.length());
		String s2 = s1.trim(); // String에 공백제거 trim
		System.out.println(s2.length());

		String s3 = s1.replace("   ", "");
		System.out.println(s3.length());

		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파 ";
		System.out.println(data.length());
		String data2 = data.trim();
		System.out.println(data2);
		System.out.println(data2.length());
		String data3 = data2.replace(" ", "");
		System.out.println(data3);
		
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num);              
		//sort 는 원데이터를 파괴해서 재정렬  <=> replace, trim 은 비파괴함수
		for (int i : num) {
			System.out.print(i + " ");
		}
	}
}