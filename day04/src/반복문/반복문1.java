package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		
		while (true) { //무한루프
		
			System.out.println("보내기");
			String q = JOptionPane.showInputDialog("중단하시려면 x를 누르세요.");
			
			if (q.equals("x")) 
			{
//				break;
				System.exit(0);
			}
	}
	}

}