package 배열응용;

public class 스트링결합추출 {

	public static void main(String[] args) {
		String s = "나는 프로그래머야";
		String s2 = "진짜";
		System.out.println(s + s2); // 스트링 결합
		System.out.println(s.concat(s2)); // s에 s2 결합
		System.out.println(s2.concat(s)); // s2에 s결합
		System.out.println(s.endsWith("야")); // 특정한 문자로 끝나는지 확인(Boolean)
		System.out.println(s.substring(3)); // index 3이후 글자들 모두 추출
		System.out.println(s.substring(3, 8)); // index 3~7까지 추출
		System.out.println(s.contains(s2)); // s에 s2가 포함되어 있는가?
		System.out.println(s.lastIndexOf("프")); // s중 특정문자의 위치
		System.out.println(s.toUpperCase()); // 대문자로
		System.out.println(s.toLowerCase()); // 소문자로
		System.out.println(s.length()); // 글자수
		System.out.println(s.replace("나", "너")); // 글자 재배치, 변환
	}

}
