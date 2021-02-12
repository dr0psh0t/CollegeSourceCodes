import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings({ "serial" })
public class ButtonTest extends JFrame 
{
	private JPanel contentPane = new JPanel();
	private TempHandler listen1 = new TempHandler();
	private CurrencyHandler listen2 = new CurrencyHandler();
	private TimerHandler listen3 = new TimerHandler();
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					@SuppressWarnings("unused")
					ButtonTest frame = new ButtonTest();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ButtonTest()
	{
		initializeWindow();
		
		JButton btnTemp = new JButton("Temp");
		btnTemp.addActionListener(listen1);
		btnTemp.setBounds(27, 29, 89, 34);
		contentPane.add(btnTemp);
		
		JButton btnCurrency = new JButton("Currency");
		btnCurrency.addActionListener(listen2);
		btnCurrency.setBounds(27, 74, 89, 34);
		contentPane.add(btnCurrency);
		
		JButton btnTimer = new JButton("Timer");
		btnTimer.addActionListener(listen3);
		btnTimer.setBounds(27, 119, 89, 34);
		contentPane.add(btnTimer);
	}
	
	public void initializeWindow()
	{
		setTitle("ButtonTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 250, 150, 251);
		setResizable(false);
		setVisible(true);
		
		contentPane.setToolTipText("HELLO WORLD!");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private class TempHandler implements ActionListener
	{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e){
			Temperature temp = new Temperature();
		}
	}
	
	private class CurrencyHandler implements ActionListener
	{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e){
			Currency curr = new Currency();
		}
	}
	
	private class TimerHandler implements ActionListener
	{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e){
			TimerWindow time = new TimerWindow();
		}
	}
}
