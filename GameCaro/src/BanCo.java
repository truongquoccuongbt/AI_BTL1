import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class BanCo extends JPanel{
	public BanCo() {
		setLayout(new GridBagLayout());
		setBounds(0, 0, 700, 650);
		GridBagConstraints gbc = new GridBagConstraints();
		for (int i = 0;i < 11;i++) {
			for (int j = 0; j < 11;j++) {
				gbc.gridx = j;
				gbc.gridy = i;
				
				OCo cell = new OCo();
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
	
	public class OCo extends JPanel {
		private Color defaultBackground;
		public OCo() {
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
}

