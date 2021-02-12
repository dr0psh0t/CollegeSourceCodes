import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Temperature extends JFrame 
{
	private JLabel celsiusLabel, fahrenheitLabel;
	private JTextField celsiusTF, fahrenheitTF;
	
	private CelsHandler celsiusHandler;
	private FahrHandler fahrenheitHandler;
	
	private static final int WIDTH = 300, HEIGHT = 90, OFFSET = 32;
	private static final double FTOC = 5.0 / 9.0, CTOF = 9.0 / 5.0;
	
	public Temperature()
	{
		/*try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		
		setTitle("Temperature Conversion");
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 2));
		
		celsiusLabel = new JLabel("Temp in Celsius: ", SwingConstants.RIGHT);
		fahrenheitLabel = new JLabel("Temp in Fahrenheit: ", SwingConstants.RIGHT);
		
		celsiusTF = new JTextField(7);
		fahrenheitTF = new JTextField(7);
		
		c.add(celsiusLabel);
		c.add(celsiusTF);
		c.add(fahrenheitLabel);
		c.add(fahrenheitTF);
		
		celsiusHandler = new CelsHandler();
		fahrenheitHandler = new FahrHandler();
		
		celsiusTF.addActionListener(celsiusHandler);
		fahrenheitTF.addActionListener(fahrenheitHandler);
		
		setBounds(400, 300, WIDTH, HEIGHT);
	//	setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class CelsHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				double celsius, fahrenheit;
				
				celsius = Double.parseDouble(celsiusTF.getText());
				fahrenheit = celsius * CTOF + OFFSET;
				fahrenheitTF.setText(String.format("%.2f", fahrenheit));
			}
			catch(Exception e1){
				fahrenheitTF.setText("Illegal value in Celsius");
			}
		}
	}
	
	private class FahrHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				double celsius, fahrenheit;
				
				fahrenheit = Double.parseDouble(fahrenheitTF.getText());
				celsius = (fahrenheit - OFFSET) * FTOC;
				celsiusTF.setText(String.format("%.2f", celsius));
			}
			catch(Exception e1){
				celsiusTF.setText("Illegal value in Fahrenheit");
			}
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Temperature tempConv = new Temperature();
	}
}
