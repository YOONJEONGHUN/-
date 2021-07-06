package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class up {

	public void up() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러줘요");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				abc x = new abc();
				x.abc();
				
			}
		});
		f.add(b);
		f.setVisible(true);
	}
}
