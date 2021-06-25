package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 윈도우5 {
	private static JTextField textField;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(64, 48, 260, 390);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setBounds(21, 25, 186, 21);
		panel.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(131, 25, 116, 21);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(132, 114, 116, 21);
		panel.add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는?");
		lblNewLabel_1.setBounds(12, 114, 186, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어점수");
		lblNewLabel_1_1.setBounds(13, 224, 186, 21);
		panel.add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setBounds(133, 224, 116, 21);
		panel.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(133, 274, 116, 21);
		panel.add(t4);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("수학점수");
		lblNewLabel_1_2.setBounds(13, 274, 186, 21);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=  t1.getText();
				if (s1.equals("아메리카노") || s1.equals("홍차") || s1.equals("커피"))
					JOptionPane.showMessageDialog(btnNewButton, "카페로가자");
				else {
					JOptionPane.showMessageDialog(btnNewButton, "물마셔");
				}
			}
		});
		btnNewButton.setBounds(11, 63, 236, 28);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int s3 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(btnNewButton_1, "당신의 내년 나이는 " + (s3 + 1) + "살 입니다.");
			}
		});
		btnNewButton_1.setBounds(12, 163, 236, 28);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s4 = t3.getText();
				String s5 = t4.getText();
				double s6 = Integer.parseInt(s4);
				double s7 = Integer.parseInt(s5);
				JOptionPane.showMessageDialog(btnNewButton_2, "두과목 점수의 평균은 " + ((s6 + s7)/2) + "입니다.");
			}
		});
		btnNewButton_2.setBounds(13, 321, 236, 28);
		panel.add(btnNewButton_2);
		
		
		
		
		f.setVisible(true);
		
	}
}
