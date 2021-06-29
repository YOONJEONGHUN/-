package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(34, 20, 420, 189);
		f.getContentPane().add(b);
		
		JLabel n = new JLabel("1");
		n.setBounds(34, 226, 420, 208);
		f.getContentPane().add(n);
		
		ImageIcon car1 = new ImageIcon("car1.jpg");
		ImageIcon car2 = new ImageIcon("car2.jpg");
		b.setIcon(car1);
		n.setIcon(car2);
		
		f.setVisible(true);

	}
}