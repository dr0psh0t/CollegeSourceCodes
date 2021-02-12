import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

@SuppressWarnings("serial")
public class GuessTheNumber extends JFrame
{
	private JButton startB, clearB;
	private JLabel inputL;
	private JTextField inputTF;
	
	private StartButtonGuessHandler guessingHandler;
	private ClearButtonHandler clearHandler;
	
	public GuessTheNumber()
	{
	/*	try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		
		setTitle("Guess The Number");
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		inputL = new JLabel("Input range limiter: ", SwingConstants.RIGHT);
		inputTF = new JTextField(5);
		
		startB = new JButton("Start");
		guessingHandler = new StartButtonGuessHandler();
		startB.addActionListener(guessingHandler);
		
		clearB = new JButton("Clear");
		clearHandler = new ClearButtonHandler();
		clearB.addActionListener(clearHandler);
		
		c.add(inputL);
		c.add(inputTF);
		c.add(startB);
		c.add(clearB);
		
		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class ClearButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			inputTF.setText("");
		}
	}
	
	private class StartButtonGuessHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int intMyNum, limiter = Integer.parseInt(inputTF.getText());
			int randomNum;
			Random rand = new Random();
			randomNum = rand.nextInt(limiter) + 1;
			String strMyNum, outputCorrect = "Correct", outputLow = "Guessed number is still low", outputHigh = "Guessed number is still high";
			boolean guessed = false;
			
			while(!guessed)
			{
				strMyNum = JOptionPane.showInputDialog("Input your guessed number(1 -"+limiter+"): ");
				intMyNum = Integer.parseInt(strMyNum);
				
				if(intMyNum == randomNum)
				{
					JOptionPane.showMessageDialog(null, outputCorrect, "Congrats", JOptionPane.INFORMATION_MESSAGE);
					guessed = true;
				}
				else if(intMyNum > randomNum)
					JOptionPane.showMessageDialog(null, outputHigh, "Still high", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, outputLow, "Still low", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		GuessTheNumber guess = new GuessTheNumber();
	}
}
