package ����Ǯ��;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ��ư3�� {

	public static void main(String[] args) {

		JFrame f = new JFrame("���� ��ư 3��");
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); // ���̾ƿ��� �������� ������ ���� �ְ� ���� ��ġ�� ���� �� �ִ�

		JButton btnNewButton = new JButton("\uBCC410\uAC1C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++)
					System.out.print("*");
				System.out.println();
			}
			
				});
		
		btnNewButton.setFont(new Font("�ü�ü", Font.BOLD, 27));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(149, 38, 206, 59);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uCEE4\uD53C*");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("Ŀ��*");
				}
		System.out.println();
			}
					});
		
		btnNewButton_1.setFont(new Font("�ü�ü", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(149, 144, 206, 59);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("\uCEE4\uD53C*\uC6B0\uC7203");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("Ŀ��*����");

				}
			}
		});
		btnNewButton_1_1.setFont(new Font("�ü�ü", Font.BOLD, 27));
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(149, 256, 206, 59);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("1:\uC9F1!");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 4; i++) {
					System.out.println(i+ ":¯!");

				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("�ü�ü", Font.BOLD, 27));
		btnNewButton_1_1_1.setBackground(Color.RED);
		btnNewButton_1_1_1.setBounds(149, 370, 206, 59);
		f.getContentPane().add(btnNewButton_1_1_1);

		f.setVisible(true);

	}
}