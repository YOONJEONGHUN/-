package 그래픽;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 처리 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel i1 = new JLabel("\uC544\uC774\uB514 :");
		i1.setFont(new Font("굴림", Font.BOLD, 20));
		i1.setBounds(49, 70, 103, 35);
		f.getContentPane().add(i1);

		JLabel i2 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC :");
		i2.setFont(new Font("굴림", Font.BOLD, 20));
		i2.setBounds(49, 136, 103, 35);
		f.getContentPane().add(i2);

		t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setBounds(221, 70, 229, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBackground(Color.ORANGE);
		t2.setBounds(221, 136, 229, 35);
		f.getContentPane().add(t2);

		JLabel i3 = new JLabel("");
		i3.setFont(new Font("굴림", Font.BOLD, 20));
		i3.setBounds(47, 408, 277, 57);
		f.getContentPane().add(i3);
		
		JButton b1 = new JButton("\uB85C\uADF8\uC778 \uD655\uC778");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r1 = t1.getText();
				String r2 = t2.getText();

				if (r1.equals("root") && r2.equals("1111")) {
					i3.setText("로그인 성공");
				} else {
					i3.setText("로그인 실패하였습니다");
				}

			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 24));
		b1.setBackground(Color.PINK);
		b1.setBounds(41, 258, 213, 73);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("\uC9C0\uC6B0\uAE30");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				i3.setText(null);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 24));
		b2.setBackground(Color.PINK);
		b2.setBounds(301, 258, 213, 73);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
