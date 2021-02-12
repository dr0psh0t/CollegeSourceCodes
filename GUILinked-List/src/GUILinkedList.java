import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GUILinkedList extends JFrame 
{
	private JButton insertB, printB, clearB, deleteB;
	private JTextField showTF;
	
	private InsertButtonHandler insertBHandler;
	private PrintButtonHandler printBHandler;
	private ClearButtonHandler clearBHandler;
	private DeleteButtonHandler deleteBHandler;
	
	Singly node = new Singly(10);
	
	public GUILinkedList()
	{
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		setTitle("Linked List");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5, 3));
		
		insertB = new JButton("Insert");
		insertB.setBounds(100, 100, 100, 100);
		printB = new JButton("Print");
		clearB = new JButton("Clear");
		deleteB = new JButton("Delete");
		showTF = new JTextField(10);
		showTF.setEditable(false);
		
		pane.add(insertB);
		pane.add(deleteB);
		pane.add(printB);
		pane.add(showTF);
		pane.add(clearB);
		
		deleteBHandler = new DeleteButtonHandler();
		deleteB.addActionListener(deleteBHandler);
		clearBHandler = new ClearButtonHandler();
		clearB.addActionListener(clearBHandler);
		printBHandler = new PrintButtonHandler();
		printB.addActionListener(printBHandler);
		insertBHandler = new InsertButtonHandler();
		insertB.addActionListener(insertBHandler);
		
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	private class DeleteButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(node.isEmpty())
				showTF.setText("Cannot delete empty list");
			else
			{
				String strKey;
				int intKey;
				
				strKey = JOptionPane.showInputDialog("Input number to delete: ");
				intKey = Integer.parseInt(strKey);
				node.deleteNodeArray(intKey);
				node.deleteNodeLinked(intKey);
			}
		}
	}
	
	private class InsertButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String strInsert;
			int intInsert;
			
			strInsert = JOptionPane.showInputDialog("Insert numbers of type(int): ");
			intInsert = Integer.parseInt(strInsert);
			node.addBeforeHead(intInsert);
		}
	}
	
	private class PrintButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(node.isEmpty())
				showTF.setText("Cannot display empty list");
			else
			{
				String text = "";
				for(int i = 0; i <= 10 - 1; i++)//this loop prints the array of converted numbers to text of type String 
				{
					if(node.intList(i) != 0)
						text += String.valueOf(" "+node.intList(i));
				}
				showTF.setText(text);
			}
		}
	}
	
	private class ClearButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			showTF.setText("");
		}
	}
	
	public static void main(String[] args){
		new GUILinkedList(); 
	}
}
