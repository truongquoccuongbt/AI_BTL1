
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
	protected ArrayList<ArrayList<Object>> dsOCo;
	
	public Giaodiengame(String title) {
		super(title);
		
		// set mainPanel
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		// set list button
	
		
		// set panel left
		panelLeft = new JPanel();
		panelLeft.setBounds(0, 0, 200, 600);
		panelLeft.setLayout(null);
		Border b = new MatteBorder(0, 0, 0, 1, Color.BLACK);
		panelLeft.setBorder(b);
		
		
		banCo = new JPanel();
		banCo.setBounds(200, 0, 700, 650);
		banCo.setLayout(null);

		BanCo p = new BanCo(11,11);
		dsOCo = p.getDsOCo();
		banCo.add(p);
		
		mainPanel.add(panelLeft);
		mainPanel.add(banCo);

		this.add(mainPanel);
	}
	
}
