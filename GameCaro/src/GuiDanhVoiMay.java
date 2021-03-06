import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiDanhVoiMay extends Giaodiengame {
	
	private JPanel panelDiem,panelButton;
	private JLabel may,nguoi,diemMay,diemNguoi;
	private JButton btTaoMoi,btDiLai,btTroLaiMenu,btThoat;
	
	public GuiDanhVoiMay(String title) {
		super(title);
		panelDiem = new JPanel();
		panelDiem.setBorder(BorderFactory.createTitledBorder("Điểm"));
		panelDiem.setBounds(0, 0, 180, 150);
		panelDiem.setLayout(null);
		
		
		// set lable
		may = new JLabel("Máy:");
		may.setBounds(10, 20, 50, 20);
		may.setFont(new Font("Arial",1, 15));
		
		diemMay = new JLabel("0");
		diemMay.setBounds(60,40,20,20);
		diemMay.setFont(new Font("Arial",1,15));
		diemMay.setForeground(Color.RED);
		
		
		nguoi = new JLabel("Người:");
		nguoi.setBounds(10, 70, 50, 20);
		nguoi.setFont(new Font("Arial",1,15));
		
		diemNguoi = new JLabel("0");
		diemNguoi.setBounds(60,100,20,20);
		diemNguoi.setFont(new Font("Arial",1,15));
		diemNguoi.setForeground(Color.RED);
		
		panelDiem.add(may);
		panelDiem.add(diemMay);
		panelDiem.add(nguoi);
		panelDiem.add(diemNguoi);
		
		// set panelbutton
		panelButton = new JPanel();
		panelButton.setBounds(0,200, 180, 400);
		panelButton.setBorder(BorderFactory.createTitledBorder("Điều khiểu"));
		panelButton.setLayout(null);
		
		btTaoMoi = new JButton("Tạo mới");
		btTaoMoi.setBounds(30,60, 120, 40);
		
		btDiLai = new JButton("Đi lại");
		btDiLai.setBounds(30,140, 120, 40);
		
		btTroLaiMenu = new JButton("Trở lại Menu");
		btTroLaiMenu.setBounds(30,220, 120, 40);
		
		btThoat = new JButton("Thoát");
		btThoat.setBounds(30,300, 120, 40);
		
		panelButton.add(btTaoMoi);
		panelButton.add(btDiLai);
		panelButton.add(btTroLaiMenu);
		panelButton.add(btThoat);
		
		this.panelLeft.add(panelDiem);
		this.panelLeft.add(panelButton);
		this.mainPanel.add(this.panelLeft);
		this.add(mainPanel);
	}
}
