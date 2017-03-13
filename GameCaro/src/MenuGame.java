
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuGame extends JFrame implements ActionListener{
	private JButton btChoiVoiMay,btChoiVoiNguoi,btThoat;
	private JLabel lbDeTai;
	private JPanel panel;
	
	public MenuGame(String title) {
		super(title);
		
		panel = new JPanel();
		panel.setLayout(null);
	
		btChoiVoiMay = new JButton("Chơi với máy");
		btChoiVoiMay.setBounds(120, 80, 140, 50);
		btChoiVoiMay.addActionListener(this);
		
		btChoiVoiNguoi = new JButton("Chơi với người");
		btChoiVoiNguoi.setBounds(120, 150, 140, 50);
		btChoiVoiNguoi.addActionListener(this);
		
		btThoat = new JButton("Thoát");
		btThoat.setBounds(120, 220, 140, 50);
		btThoat.addActionListener(this);
		
		lbDeTai = new JLabel("ĐỀ TÀI TRÒ CHƠI CỜ CARO");
		lbDeTai.setFont(new Font("Arial", Font.BOLD, 25));
		lbDeTai.setBounds(30, 0, 340, 70);
		lbDeTai.setForeground(Color.RED);
		
		panel.add(lbDeTai);
		panel.add(btChoiVoiMay);
		panel.add(btChoiVoiNguoi);
		panel.add(btThoat);
		
		this.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btChoiVoiMay) {
			GuiDanhVoiMay guiMay = new GuiDanhVoiMay("Caro");
			guiMay.setSize(850,650);
			guiMay.setVisible(true);
			guiMay.setResizable(false);
		}
		
		else if (e.getSource() == btChoiVoiNguoi) {
			GuiNguoiNguoi guiNguoi = new GuiNguoiNguoi("Caro");
			guiNguoi.setSize(850,650);
			guiNguoi.setVisible(true);
			guiNguoi.setResizable(false);
		}
		
		else if (e.getSource() == btThoat) {
			System.exit(EXIT_ON_CLOSE);
		}
		
	}
}
