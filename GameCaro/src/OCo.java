import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


 
public class OCo extends JPanel {
		private Color defaultBackground;
		private int row;
		private int soHuu;
		public int getSoHuu() {
			return soHuu;
		}

		public void setSoHuu(int soHuu) {
			this.soHuu = soHuu;
		}

		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}

		private int column;
		
		
		public OCo() {
			row = 0;
			column = 0;
			soHuu = 0;
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					defaultBackground = getBackground();
					setBackground(Color.BLUE);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					setBackground(defaultBackground);
				}
			});		
		}
		
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(50, 50);
		}
	}