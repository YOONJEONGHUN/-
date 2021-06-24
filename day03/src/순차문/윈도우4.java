package 순차문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 윈도우4 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAVER");
		lblNewLabel.setBounds(296, 10, 443, 103);
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 81));
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 108, 684, 59);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 177, 684, 59);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(108, 281, 684, 59);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}

}
