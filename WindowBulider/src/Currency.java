import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Currency extends JFrame {

	private JPanel contentPane;
	private JTextField txtInputCurrency, txtOutput, txtInput;
	private JLabel lblCurrency;
	private ButtonGroup grpButtons;
	private final JButton btnClear = new JButton("Clear");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					Currency frame = new Currency();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void initializeWindow()
	{
		setTitle("Currency");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 394, 240);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public Currency() 
	{
		initializeWindow();
		grpButtons = new ButtonGroup();
		
		JPanel currencyPanel = new JPanel();
		currencyPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Currencies", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		currencyPanel.setBounds(72, 11, 238, 102);
		contentPane.add(currencyPanel);
		currencyPanel.setLayout(null);
		
// RADIO BUTTONS INITIALIZATION
		JRadioButton rdbtnYenToPhp = new JRadioButton("JPY to PHP");
		rdbtnYenToPhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrency.setText("JPY:");
			}
		});
		rdbtnYenToPhp.setBounds(124, 23, 106, 30);
		currencyPanel.add(rdbtnYenToPhp);
		
		JRadioButton rdbtnUsdToPhp = new JRadioButton("USD to PHP");
		rdbtnUsdToPhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrency.setText("USD:");
			}
		});
		rdbtnUsdToPhp.setBounds(10, 23, 106, 30);
		currencyPanel.add(rdbtnUsdToPhp);
		
		JRadioButton rdbtnPhpToUsd = new JRadioButton("PHP to USD");
		rdbtnPhpToUsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblCurrency.setText("PHP:");
			}
		});
		rdbtnPhpToUsd.setBounds(10, 56, 94, 30);
		currencyPanel.add(rdbtnPhpToUsd);
		
		JRadioButton rdbtnPhpToYen = new JRadioButton("PHP to JPY");
		rdbtnPhpToYen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrency.setText("PHP:");
			}
		});
		rdbtnPhpToYen.setBounds(124, 56, 106, 30);
		currencyPanel.add(rdbtnPhpToYen);
// END RADION BUTTONS INITIALIZATION		
		
		grpButtons.add(rdbtnPhpToUsd);
		grpButtons.add(rdbtnPhpToYen);
		grpButtons.add(rdbtnUsdToPhp);
		grpButtons.add(rdbtnYenToPhp);
		
		lblCurrency = new JLabel("<currency>");
		lblCurrency.setBounds(41, 124, 68, 21);
		contentPane.add(lblCurrency);
		
		txtInputCurrency = new JTextField();
		txtInputCurrency.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnUsdToPhp.isSelected())
				{
					double usd, php = 43.9599086;
					
					usd = Double.parseDouble(txtInputCurrency.getText());
					txtInput.setText(String.format("USD %.2f", usd));
					txtOutput.setText(String.format("PHP %.2f", usd * php));
				}
				else if(rdbtnPhpToUsd.isSelected())
				{
					double usd = 0.022748, php;
					
					php = Double.parseDouble(txtInputCurrency.getText());
					txtInput.setText(String.format("PHP %.2f", php));
					txtOutput.setText(String.format("USD %.2f", usd * php));
				}
				else if(rdbtnYenToPhp.isSelected())
				{
					double yen, php = 0.411728504;
					
					yen = Double.parseDouble(txtInputCurrency.getText());
					txtInput.setText(String.format("JPY %.2f", yen));
					txtOutput.setText(String.format("PHP %.2f", yen * php));
				}
				else if(rdbtnPhpToYen.isSelected())
				{
					double php, yen = 2.42878497;
					
					php = Double.parseDouble(txtInputCurrency.getText());
					txtInput.setText(String.format("PHP %.2f", php));
					txtOutput.setText(String.format("JPY %.2f", yen * php));
				}
			}
		});
				
		txtInputCurrency.setColumns(10);
		txtInputCurrency.setBounds(126, 124, 116, 20);
		contentPane.add(txtInputCurrency);
		
		txtOutput = new JTextField();
		txtOutput.setEditable(false);
		txtOutput.setColumns(10);
		txtOutput.setBounds(201, 156, 154, 20);
		contentPane.add(txtOutput);
		
		JLabel lblequals = new JLabel("=");
		lblequals.setVerticalAlignment(SwingConstants.BOTTOM);
		lblequals.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblequals.setBounds(179, 160, 17, 13);
		contentPane.add(lblequals);
		
		txtInput = new JTextField();
		txtInput.setEditable(false);
		txtInput.setColumns(10);
		txtInput.setBounds(24, 156, 143, 20);
		contentPane.add(txtInput);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				lblCurrency.setText("<currency>");
				txtInput.setText("");
				txtInputCurrency.setText("");
				txtOutput.setText("");
			}
		});
		btnClear.setBounds(277, 119, 78, 31);
		contentPane.add(btnClear);
	}
}