import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
//import java.awt.event.*;

@SuppressWarnings("serial")
public class RadioButton extends JFrame 
{
	private JRadioButton btnYoutube, btnFacebook;
	private JPanel pane;
	private JTextField outputTF;
	private ButtonGroup grpButtons;
	
	public RadioButton(int width, int height)
	{
		pane = new JPanel();
		
		btnYoutube = new JRadioButton("YouTube");
		btnFacebook = new JRadioButton("Facebook");
		outputTF = new JTextField(10);
		outputTF.setEditable(false);
		
		grpButtons = new ButtonGroup();
		grpButtons.add(btnFacebook);
		grpButtons.add(btnYoutube);
		
		pane.add(btnFacebook);
		pane.add(btnYoutube);
		pane.add(outputTF);
		
		getContentPane().add(pane);
		
		setTitle("Radio Button");
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	static Scanner console = new Scanner(System.in);
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
/*		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			e.printStackTrace();
		}
*/				
		System.out.print("Input frame width: ");
		int width = console.nextInt();
		System.out.print("Input frame height: ");
		int height = console.nextInt();

//		int width = 200, height = 100;
		RadioButton rad = new RadioButton(width, height);
	}
}
