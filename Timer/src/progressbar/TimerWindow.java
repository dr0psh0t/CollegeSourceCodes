package progressbar;
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
	private Timer time = new Timer(25, listen1);
	
	private StartHandler start = new StartHandler();
	private PauseHandler pause = new PauseHandler();
	private StopHandler stop = new StopHandler();
	
	private JButton btnStart, btnPause, btnStop;
	private JProgressBar progressBar = new JProgressBar(0, 60);
	
	public TimerWindow() 
	{
	//	windowDefault();
		initializeTimer();
		
		lblSeconds.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblSeconds.setBounds(178, 11, 28, 33);
		contentPane.add(lblSeconds);
		
		btnStart = new JButton("start");
		btnStart.addActionListener(start);
		btnStart.setBounds(22, 55, 89, 29);
		contentPane.add(btnStart);
		
		btnPause = new JButton("pause");
		btnPause.addActionListener(pause);
		btnPause.setBounds(117, 55, 89, 29);
		contentPane.add(btnPause);
		
		btnStop = new JButton("stop");
		btnStop.addActionListener(stop);
		btnStop.setBounds(211, 55, 89, 29);
		contentPane.add(btnStop);
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblMinutes.setBounds(140, 11, 28, 33);
		contentPane.add(lblMinutes);
		
		progressBar.setBounds(22, 95, 278, 29);
		progressBar.setStringPainted(true);
		contentPane.add(progressBar);
	}
	
	private class MyListener implements ActionListener
	{		
		public MyListener(JLabel label){
			lblSeconds = label;
		}
		
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e)
		{
			seconds++;
			if(seconds == 60)
			{
				minutes++;
				lblMinutes.setText(""+minutes);
				seconds = 0;
				progressBar.setValue(seconds);
				WindowTest win = new WindowTest((int)(Math.random() * 1000), (int)(Math.random() * 700));
			}
			lblSeconds.setText(""+seconds);
			progressBar.setValue(seconds);
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
			progressBar.setValue(0);
		}
	}
	
	public void initializeTimer()
	{
		setTitle("Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 183);
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
