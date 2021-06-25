package 순차문;

import javax.swing.JOptionPane;

public class 순차문5 {

	public static void main(String[] args) {
				
		String id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		String pw = JOptionPane.showInputDialog("패스워드를 입력해주세요.");
		
		String id2 = "root"; // 회원가입시 가입한 id
		String pw2 = "pass"; // 회원가입시 가입한 pw

		// 기본형 데이터가 아니면 연산자를 가지고 비교할 수 없다.
		
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		System.out.println(id.equals(id2) && pw.equals(pw2));
	
	if (id.equals(id2) && pw.equals(pw2)) {
		JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
	} else {
		JOptionPane.showMessageDialog(null, "아이디나 패스워드가 틀립니다.");
	}
	} // main

} // class
