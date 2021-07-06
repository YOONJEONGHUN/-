package 배열응용;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String s ="감자,고구마,양파";
		String[] s2 = s.split(","); //{"감자","고구마","양파"}
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2.length);
		System.out.println(s2[0].equals(s2[1]));
		
		// 일,월,화요일의 날씨를 순서대로 입력해보세요.(흐림,맑음,흐림)
		// 흐림이 몇 개인가요? 맑음이 몇 개인가요?
		// 1.스캐너로 입력 sc.next()
		// 2. 스트링을 배열로 변환
		// 3. count
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일,월,화요일의 날씨를 순서대로 입력하세요>>>>  ");
	int count = 0;
	int count2 = 0;	
	 String x = sc.nextLine();
	 
	 String[] w = x.split(",");
	for (int i = 0; i < w.length; i++) {
		if(w[i].equals("흐림")) {
			count++;
		}else {
			count2++;
		}
		
	} 
	System.out.println("흐림 : "+ count);
	System.out.println("맑음 : "+ count2);
	sc.close();
	}

}
