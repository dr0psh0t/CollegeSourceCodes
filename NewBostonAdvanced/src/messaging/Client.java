package messaging;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Client extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7997070850001213669L;
	
	private JTextField userText;
	private	JTextArea chatWindow;
	
	private ObjectOutputStream output;
	private ObjectInputStream input;
	
	private String message = "";
	private String serverIP;
	private Socket connection;
	
	public Client(String host)
	{
		super("Client mofo!");
		serverIP = host;
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sendMessage(e.getActionCommand());
				userText.setText("");
			}
		});
		
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		setSize(300, 500);
		setVisible(true);
	}
	
	// connect to server
	public void startRunning()
	{
		try
		{
			connectToServer();
			setupStreams();
			whileChatting();
		}
		catch(EOFException eofException){
			showMessage("\n Client terminated connection");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			closeCrap();
		}
	}
	
	private void connectToServer() throws IOException
	{
		showMessage("Attempting connection... \n");
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		showMessage("Connected to: "+connection.getInetAddress().getHostName());
	}
	
	// setup streams to send and receice messages
	private void setupStreams() throws IOException
	{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Dude your streams are now good to go! \n");
	}
	
	// while chatting with server
	private void whileChatting() throws IOException
	{
		ableToType(true);
		
		do
		{
			try
			{
				message = (String) input.readObject();
				showMessage("\n"+message);
			}
			catch(ClassNotFoundException classNotFoundException){
				showMessage("\n I don't know that object type");
			}
		}
		while(!message.equals("SERVER - END"));
	}
	
	// close the streams and sockets
	private void closeCrap()
	{
		showMessage("\n closing crap down...");
		ableToType(false);
		
		try
		{
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	private void sendMessage(final String message)
	{
		try
		{
			output.writeObject("CLIENT - "+message);
			output.flush();
			showMessage("\nCLIENT - "+message);
		}
		catch(IOException ioException){
			chatWindow.append("\n something messed up sending message hoss!");
		}
	}
	
	// update chatWindow
	private void showMessage(final String m)
	{
		SwingUtilities.invokeLater(new Runnable(){	
			@Override
			public void run(){
				chatWindow.append(m);
			}
		});
	}
	
	// gives user permission to type crap into the text box
	private void ableToType(final boolean tof)
	{
		SwingUtilities.invokeLater(new Runnable(){	
			@Override
			public void run(){
				userText.setEditable(tof);
			}
		});
	}
}