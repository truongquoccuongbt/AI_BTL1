
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class Giaodiengame extends JFrame{
	
	protected JPanel panelLeft;
	protected JPanel mainPanel;
	protected JPanel banCo;
	protected ArrayList<ArrayList<JButton>> dsOCo;
	
	public Giaodiengame(String title) {
		super(title);
		
		// set mainPanel
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		// set list button
		dsOCo = new ArrayList<>();
		for (int i = 0 ;i < 11;i++) {
			dsOCo.add(new ArrayList<>());
		}
		
		// set panel left
		panelLeft = new JPanel();
		panelLeft.setBounds(0, 0, 200, 600);
		panelLeft.setLayout(null);
		Border b = new MatteBorder(0, 0, 0, 1, Color.BLACK);
		panelLeft.setBorder(b);
		
		//set panel board
		/*GridLayout g = new GridLayout(11, 11);
		banCo = new JPanel();
		banCo.setLayout(g);
		banCo.setBounds(200, 0, 700, 650);
		
		JButton bt;
		for (int i = 0;i < 11;i++) {
			for (int j = 0;j < 11;j++) {
				bt = new JButton();
				dsOCo.get(i).add(bt);
				banCo.add(bt);
			}
		}*/
		
		banCo = new JPanel();
		banCo.setBounds(200, 0, 700, 650);
		banCo.setLayout(null);

		JPanel p = new BanCo();
		banCo.add(p);
		
		mainPanel.add(panelLeft);
		mainPanel.add(banCo);

		this.add(mainPanel);
	}
	
}
