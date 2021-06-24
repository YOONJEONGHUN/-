package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		
		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 91));
		textField.setText("  나의 일기장");
		textField.setBackground(Color.PINK);
		textField.setBounds(12, 10, 660, 222);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(136, 273, 536, 21);
		f.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 306, 536, 21);
		f.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(136, 337, 536, 21);
		f.getContentPane().add(textField_8);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.PINK);
		textArea.setBounds(136, 369, 536, 137);
		f.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("<<<오늘의 일기작성을 시작합니다>>>");
		lblNewLabel.setBounds(203, 242, 251, 21);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("번호");
		lblNewLabel_1.setBounds(62, 273, 112, 21);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("날짜");
		lblNewLabel_1_1.setBounds(62, 306, 112, 21);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("제목");
		lblNewLabel_1_1_1.setBounds(62, 337, 112, 21);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("내용");
		lblNewLabel_1_1_1_1.setBounds(62, 425, 112, 21);
		f.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("오늘의 하루가 저장되었습니다");
				JOptionPane.showMessageDialog(f, "오늘의 하루가 저장되었습니다.");
			}
		});
		btnNewButton.setBounds(136, 516, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(286, 516, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("방명록");
		btnNewButton_1_1.setBounds(429, 516, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);
		
		
		f.setVisible(true);
		
	}
}
