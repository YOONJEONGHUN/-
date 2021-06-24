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

public class 윈도우2 {
	private static JTextField txtPw;
	private static JTextField textField;
	private static JTextField textField_2;
	private static JTextField textField_1;
	private static JTextField textField_4;
	private static JTextField textField_3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼2");
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 49));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요!!!");
				JOptionPane.showMessageDialog(f, "이 버튼이 아닙니다.");
			}
		});
		btnNewButton.setBounds(147, 210, 181, 108);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼1");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("휴먼모음T", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(163, 59, 136, 44);
		f.getContentPane().add(btnNewButton_1);
		
		txtPw = new JTextField();
		txtPw.setFont(new Font("한컴 윤체 L", Font.PLAIN, 12));
		txtPw.setBackground(Color.MAGENTA);
		txtPw.setBounds(269, 378, 116, 21);
		f.getContentPane().add(txtPw);
		txtPw.setColumns(10);
		
		textField = new JTextField();
		textField.setText("아이디");
		textField.setBackground(Color.GREEN);
		textField.setBounds(66, 378, 144, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("패스워드");
		textField_2.setColumns(10);
		textField_2.setBackground(Color.GREEN);
		textField_2.setBounds(76, 413, 116, 21);
		f.getContentPane().add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("한컴 윤체 L", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.MAGENTA);
		textField_1.setBounds(269, 409, 116, 21);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton_2 = new JButton("눌러보세요");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요");
				JOptionPane.showMessageDialog(f, "저를 누르셨군요");
			}
		});
		btnNewButton_2.setBounds(51, 137, 136, 33);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(12, 10, 57, 33);
		f.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(51, 370, 159, 29);
		f.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(51, 409, 159, 29);
		f.getContentPane().add(textField_3);
		
		
		f.setVisible(true);
		
	}
}
