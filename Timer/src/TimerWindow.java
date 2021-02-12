import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class TimerWindow extends JFrame 
{
	private int seconds = 0, minutes = 0;
	private JPanel contentPane;
	
	private JLabel lblMinutes = new JLabel("0");
	private JLabel lblSeconds = new JLabel("0");
	private MyListener listen1 = new MyListener(lblSeconds);
	private Timer time = new Timer(1000, listen1);
	
	private StartHandler start = new StartHandler();
	private PauseHandler pause = new PauseHandler();
	private StopHandler stop = new StopHandler();
	
	private JButton btnStart, btnPause, btnStop;
	
	public TimerWindow() 
	{
		windowDefault();
		initializeTimer();
		
		lblSeconds.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblSeconds.setBounds(90, 11, 28, 33);
		contentPane.add(lblSeconds);
		
		btnStart = new JButton("start");
		btnStart.addActionListener(start);
		btnStart.setBounds(33, 55, 89, 29);
		contentPane.add(btnStart);
		
		btnPause = new JButton("pause");
		btnPause.addActionListener(pause);
		btnPause.setBounds(33, 88, 89, 29);
		contentPane.add(btnPause);
		
		btnStop = new JButton("stop");
		btnStop.addActionListener(stop);
		btnStop.setBounds(33, 121, 89, 29);
		contentPane.add(btnStop);
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblMinutes.setBounds(52, 11, 28, 33);
		contentPane.add(lblMinutes);
	}
	
	private class MyListener implements ActionListener
	{		
		public MyListener(JLabel label){
			lblSeconds = label;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			seconds++;
			if(seconds == 60)
			{
				minutes++;
				lblMinutes.setText(""+minutes);
				seconds = 0;
			}
			lblSeconds.setText(""+seconds);
		}
	}
	
	private class StartHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			time.start();
		}
	}

	private class PauseHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			time.stop();
		}
	}
	
	private class StopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			time.stop();
			seconds = 0;
			minutes = 0;
			lblMinutes.setText(""+minutes);
			lblSeconds.setText(""+seconds);
		}
	}
	
	public void initializeTimer()
	{
		setTitle("Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 172, 209);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void windowDefault()
	{
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TimerWindow frame = new TimerWindow();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
