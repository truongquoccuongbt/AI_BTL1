import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MenuGame gd = new MenuGame("Caro");
				gd.setSize(400,400);
				gd.setVisible(true);
				gd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}

}
