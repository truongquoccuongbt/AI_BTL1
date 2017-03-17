import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class BanCo extends JPanel {
	
	private int LuotDanh = 1;
	private ArrayList<ArrayList<Object>> dsOCo;


	public ArrayList<ArrayList<Object>> getDsOCo() {
		return dsOCo;
	}


	public void setDsOCo(ArrayList<ArrayList<Object>> dsOCo) {
		this.dsOCo = dsOCo;
	}


	public BanCo(int soDong,int soCot) {

		
		dsOCo = new ArrayList<>();
		for (int i = 0;i < 11;i++) {
			dsOCo.add(new ArrayList<Object>());
		}
		
		
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		setBounds(0, 0, 700, 650);
		GridBagConstraints gbc = new GridBagConstraints();
		for (int i = 0;i < 11;i++) {
			for (int j = 0; j < 11;j++) {
				gbc.gridx = j;
				gbc.gridy = i;
				
				OCo cell = new OCo();
				
				cell.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						OCo o = (OCo)e.getSource();
						DanhCo(o);
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				cell.setRow(i);
				cell.setColumn(j);
				dsOCo.get(i).add(cell);
				Border border = null;
				
				if (i < 10) {
					if (j < 10) {
						border = new MatteBorder(1, 1, 0, 0, Color.GRAY);
					}
					else {
						border = new MatteBorder(1, 1, 0, 1, Color.GRAY);
					}
				}
				else {
					if (j < 10) {
						border = new MatteBorder(1, 1, 1, 0, Color.GRAY);
					}
					else {
						border = new MatteBorder(1, 1, 1, 1, Color.GRAY);
					}
				}
				cell.setBorder(border);
				add(cell,gbc);
			}
		}
		
	}

	private void DanhCo(OCo o) {
		switch (LuotDanh) {
		case 1:
			Image im = new ImageIcon(getClass().getResource("O.png")).getImage();
			JLabel label = new JLabel();
			label.setIcon(new ImageIcon(im));
			
			label.setBounds(1, 0, 50, 50);
			o.add(label);
			LuotDanh = 2;
			repaint();
			break;
		case 2:
			Image imm = new ImageIcon(getClass().getResource("x.png")).getImage();
			JLabel labell = new JLabel();
			labell.setIcon(new ImageIcon(imm));
			
			labell.setBounds(1, 0, 50, 50);
			o.add(labell);
			LuotDanh = 1;
			repaint();
			break;
		default:
			break;
		}
	}

}

