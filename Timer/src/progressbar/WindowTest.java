package progressbar;
import javax.swing.*;

@SuppressWarnings("serial")
public class WindowTest extends JFrame 
{
	private JPanel panel;
	
	public WindowTest(int x, int y)
	{		
		setTitle("Auto");
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(x, y, 180, 100);
		
		panel = new JPanel();
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel myLabel = new JLabel("Auto");
		myLabel.setBounds(65, 22, 46, 14);
		panel.add(myLabel);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		WindowTest win = new WindowTest((int)(Math.random() * 1000), (int)(Math.random() * 700));
	}
}

//(int)(Math.random() * 1000), (int)(Math.random() * 700)