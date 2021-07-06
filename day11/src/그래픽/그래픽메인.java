package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		JButton b1 = new JButton("나는 왼쪽");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				up up = new up();
				up.up();
			}
		});
		JButton b2 = new JButton("나는 오른쪽");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				up up = new up();
				up.up();
			}
		});
		JButton b3 = new JButton("나는 가운데");
		JButton b4 = new JButton("나는 아랫쪽");
		JButton b5 = new JButton("나는 윗쪽");
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을때 처리하는 내용을 쓴다.
				up up = new up();
				up.up();
			}
		});
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);

		b1.setBackground(Color.yellow);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.CYAN);
		b4.setBackground(Color.GREEN);
		b5.setBackground(Color.pink);

		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

		f.setVisible(true);

	}

}
