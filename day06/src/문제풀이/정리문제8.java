package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 정리문제8 {

	public static void main(String[] args) {

		JFrame f = new JFrame("나의 버튼 5개");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uBD81\uCABD");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "북쪽입니다.");
			}
		});
		btnNewButton.setBounds(204, 31, 91, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC11C\uCABD");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton_1.setBounds(12, 207, 91, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uB3D9\uCABD");
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton_1_1.setBounds(383, 207, 91, 23);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\uB0A8\uCABD");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다.");
			}
		});
		btnNewButton_1_1_1.setBackground(Color.CYAN);
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton_1_1_1.setBounds(204, 430, 91, 23);
		f.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("\uAC00\uC6B4\uB370");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton_2.setBounds(178, 191, 133, 54);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		
	}
}