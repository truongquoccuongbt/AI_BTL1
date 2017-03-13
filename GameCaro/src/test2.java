import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test2 extends JFrame{
	public test2(String title) {
		super(title);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 800);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		
		JPanel p = new BanCo();
		panel.add(p);
		this.add(panel);
	}
}
