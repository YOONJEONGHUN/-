package 문제풀이;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼20개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나는 버튼 200개");
		f.setSize(800, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		

		for (int i = 0; i < 200; i++) {
			JButton b1 = new JButton((i + 1) + "번");
			f.add(b1);
		}
		f.setVisible(true);
	}

}
